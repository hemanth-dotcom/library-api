package com.example.libraryapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.example.libraryapi.model.Book;
import com.example.libraryapi.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository repo;

    // CREATE
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return repo.save(book);
    }

    // READ
    @GetMapping
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    // UPDATE
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        book.setId(id);
        return repo.save(book);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        repo.deleteById(id);
        return "Book deleted successfully";
    }
}