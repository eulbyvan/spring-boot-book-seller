package com.eulbyvan.springbootbookseller.util;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 08/12/2022
 */

public class SecurityUtils {
    public static final String ROLE_PREFIX = "ROLE_";

    public static SimpleGrantedAuthority convertToAuthority(String role) {
        String formattedRole = role.startsWith(ROLE_PREFIX) ? role : ROLE_PREFIX + role;

        return new SimpleGrantedAuthority(formattedRole);
    }
}
