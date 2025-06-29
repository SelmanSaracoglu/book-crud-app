package com.example.book_crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Bu sınıfı veritabanı tablosu olarak işaretler.
public class Book {

    @Id //  Primary Key alanını belirtir.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  ID değerini otomatik üretir.
    private Long id;
    private String title;
    private String author;
    private Double price;

    // Default constructor
    public Book() {
    }

    // Parametreli constructor
    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }

    // Getters and Setters
    // They are used for accessing and updating the fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
