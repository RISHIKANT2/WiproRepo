package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {
	
	
	@Autowired
	BookRepository bookRepo;

    public Flux<Book> getAllBooks() {

        List<Book> books = List.of(
                new Book(1L, "Java", 500),
                new Book(2L, "Spring", 700),
                new Book(3L, "WebFlux", 900)
        );

        return Flux.fromIterable(books);
    }

    public Mono<Book> getBookById(Long id) {

        Book book = new Book(id, "Reactive Programming", 1000);

        return Mono.just(book);
    }
    
    public Mono<Book> saveBook(Book book ){
    	
    	return bookRepo.save(book);
    }
} 
