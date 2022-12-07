package com.eulbyvan.springbootbookseller.repository;

import com.eulbyvan.springbootbookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 07/12/2022
 */

public interface IBookRepository extends JpaRepository<Book, Long> {
}
