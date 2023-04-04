package com.theonewhocode.service;

import com.theonewhocode.entity.Book;

import java.util.List;

public interface BookService {

    Book addBook(Book book);

    Book getBookById(int id);

    List<Book> getAllBooks();

    void deleteBookById(int id);

    Book updateBook(Book book, int id);
}
