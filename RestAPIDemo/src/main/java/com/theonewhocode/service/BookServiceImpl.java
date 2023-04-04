package com.theonewhocode.service;

import com.theonewhocode.entity.Book;
import com.theonewhocode.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().iterator().forEachRemaining(books::add);
        return books;
    }

    @Override
    public void deleteBookById(int id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book updateBook(Book book, int id) {
        Book fromRepo = bookRepository.findById(id).get();
        fromRepo.setName(book.getName());
        fromRepo.setAuthor(book.getAuthor());
        return bookRepository.save(fromRepo);
    }
}
