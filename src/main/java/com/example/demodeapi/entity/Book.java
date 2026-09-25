package com.example.demodeapi.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    @Column (nullable = false) private String title;
    @Column (nullable = false) private String author;
    @Column (nullable = false) private int year;
    @Column (nullable = false) private boolean available;

    public Book() {}

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

}
