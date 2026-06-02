package com.wipro.ReactiveDemo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.wipro.ReactiveDemo.model.Book;

@Repository
public interface BookRepository extends ReactiveMongoRepository<Book, Integer> {

}
