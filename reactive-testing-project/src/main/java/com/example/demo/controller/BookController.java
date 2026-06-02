package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public Flux<Book> getBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Mono<Book> getSingleBook(@PathVariable Long id) {
        return service.getBookById(id);
    }
    
    @PostMapping("/add")
    public Mono<Book> saveBook(@RequestBody Book book){
    	return service.saveBook(book);
    }
}
