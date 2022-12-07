package com.eulbyvan.springbootbookseller.repository;

import com.eulbyvan.springbootbookseller.model.Role;
import com.eulbyvan.springbootbookseller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 07/12/2022
 */

public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    @Modifying
    @Query("update User set role = :role where username = :username")
    void updateUserRole(@Param("username") String username, @Param("role") Role role);
}
