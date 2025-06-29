package com.example.book_crud.service;

import com.example.book_crud.model.Book;
import com.example.book_crud.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    private final BookRepository bookRepository;

    // Constructor injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Returns all books from the database
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    // Finds a book by its ID
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    // Saves or updates a book
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    // Deletes a book by its ID
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }



}
