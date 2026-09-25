package com.example.demodeapi.repository;
import com.example.demodeapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Integer> {


}
