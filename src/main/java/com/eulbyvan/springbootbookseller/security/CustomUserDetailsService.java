package com.eulbyvan.springbootbookseller.security;

import com.eulbyvan.springbootbookseller.model.User;
import com.eulbyvan.springbootbookseller.service.IUserService;
import com.eulbyvan.springbootbookseller.util.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 08/12/2022
 */

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(username));

        Set<GrantedAuthority> authorities = Set.of(SecurityUtils.convertToAuthority(user.getRole().name()));

        return UserPrincipal
                .builder()
                .user(user).id(user.getId())
                .username(username)
                .password(user.getPassword())
                .build();
    }
}
