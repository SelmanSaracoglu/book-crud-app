package com.example.book_crud.repository;


import com.example.book_crud.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

// This interface provides CRUD operations for Book entity
public interface BookRepository extends JpaRepository<Book, Long> {
    // Custom query methods can be added here in the future


}
