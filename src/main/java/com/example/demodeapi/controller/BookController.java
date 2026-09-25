package com.example.demodeapi.controller;

import com.example.demodeapi.entity.Book;
import com.example.demodeapi.service.BookService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/livros")
    public Object addBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping("/livros")
    public List<Book> getAllBooks() { return bookService.getAllBooks();}

    @GetMapping("/livros/{id}")
    public Book getBookById(@PathVariable Integer id) { return bookService.listOneBook(id);}


    @PutMapping("/livros/{id}")
    public Book updateBook(@PathVariable Integer id, @RequestBody Book book) {
        book.setId(id);
        return bookService.updateBook(book);
    }

    @DeleteMapping("/livros/{book}")
    public void deleteBook(@RequestBody Book book) { bookService.deleteBook(book);}

}
