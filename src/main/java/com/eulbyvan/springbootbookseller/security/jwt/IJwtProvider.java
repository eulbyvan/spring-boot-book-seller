package com.eulbyvan.springbootbookseller.security.jwt;

import com.eulbyvan.springbootbookseller.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 08/12/2022
 */

public interface IJwtProvider {
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);
}
