package com.example.repository;

import com.example.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository {
    List<Book> findAll();
}
