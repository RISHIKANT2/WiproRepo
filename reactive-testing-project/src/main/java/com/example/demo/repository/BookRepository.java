package com.example.demo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.demo.entity.Book;

public interface BookRepository extends ReactiveCrudRepository<Book, Integer> {

}
