package com.example.demodeapi.service;

import com.example.demodeapi.entity.Book;
import com.example.demodeapi.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

   public BookService(BookRepository bookRepository) {

       this.bookRepository = bookRepository;
   }

    public Book createBook(Book book) {
        if (book == null) {
            book = new Book();
            return bookRepository.save(book);
        }
        if (book.getTitle().isEmpty()) {
            System.out.print("Title is empty");
            return null;

        }
        if (book.getAuthor().isEmpty()) {
            System.out.print("Author is empty");
            return null;
        }
       return bookRepository.save(book);

    }

    public List<Book> getAllBooks() {
       return bookRepository.findAll();
    }

    public Book listOneBook(int id) {
       Book book = bookRepository.getReferenceById(id);
        if (book.getId() == id){
            return bookRepository.getReferenceById(book.getId());
        }
        return null;
    }

    public Book updateBook(Book book){
       return bookRepository.save(book);
    }

    public void deleteBook(Book book){
        bookRepository.delete(book);
    }
}
