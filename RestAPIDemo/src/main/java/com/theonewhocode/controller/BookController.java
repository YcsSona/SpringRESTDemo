package com.theonewhocode.controller;

import com.theonewhocode.entity.Book;
import com.theonewhocode.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable(value = "id") int id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @DeleteMapping("/books/{id}")
    public void deleteBookById(@PathVariable("id") int id) {
        bookService.deleteBookById(id);
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable("id") int id) {
        return bookService.updateBook(book, id);
    }
}
