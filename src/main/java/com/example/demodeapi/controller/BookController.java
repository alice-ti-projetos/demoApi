package com.example.demodeapi.controller;

import com.example.demodeapi.entity.Book;
import com.example.demodeapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/livros")
    public Object addBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping("/livros")
    public List<Book> getBooks(@RequestBody Book book) {
        return bookService.listBooks(book);
    }

    @GetMapping("/livros/{id}")
    public Book getBook(@RequestBody Book book,@PathVariable Integer id) {
        return bookService.listOneBook(book,id);
    }
}
