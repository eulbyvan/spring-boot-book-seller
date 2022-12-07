package com.eulbyvan.springbootbookseller.service;

import com.eulbyvan.springbootbookseller.model.User;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 07/12/2022
 */

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    void makeAdmin(String username);
}
