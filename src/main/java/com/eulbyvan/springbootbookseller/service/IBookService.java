package com.eulbyvan.springbootbookseller.service;

import com.eulbyvan.springbootbookseller.model.Book;

import java.util.List;

/**
 * @author stu (https://www.eulbyvan.com/)
 * @version 1.0
 * @since 07/12/2022
 */

public interface IBookService {
    Book saveBook(Book book);

    void deleteBookById(Long id);

    List<Book> findAllBooks();
}
