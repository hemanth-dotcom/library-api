package com.example.libraryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.libraryapi.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}