package com.example.demodeapi.service;

import com.example.demodeapi.entity.Book;
import org.springframework.boot.SpringApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService {
    private final Scanner scanner = new Scanner(System.in);
    private final List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(BookService.class, args);
    }

    public Object createBook(Book book) {
        if (book == null) {
            book = new Book(
                    scanner.nextInt(),
                    scanner.nextLine(),
                    scanner.nextLine(),
                    scanner.nextInt(),
                    scanner.nextBoolean()
            );
            return book;
        }
        if (book.title.isEmpty()) {
            System.out.print("Title is empty");
            return null;

        }
        if (book.author.isEmpty()) {
            System.out.print("Author is empty");
            return null;
        }
        BookService bookService = new BookService();
        return bookService.createBook(book);
    }

    public List<Book> listBooks(Book book) {
        if (book == null) {
            createBook(book);
            books.add(book);
            return books;
        }
        return books;
    }

    public Book listOneBook(Book book,int id) {
        if (book.id == id){
            return books.get(id);
        }
        return null;
    }
}
