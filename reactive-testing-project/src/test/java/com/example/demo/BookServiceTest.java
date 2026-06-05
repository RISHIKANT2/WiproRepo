package com.example.demo;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;

import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

	
    
    @Mock
    private BookRepository repo;
    
    @InjectMocks
    private BookService service;

    @Test
    void testGetAllBooks() {

        StepVerifier.create(service.getAllBooks())
                .expectNextCount(3)
                .verifyComplete();
    }

    @Test
    void testGetBookById() {

        StepVerifier.create(service.getBookById(1L))
                .expectNextMatches(book ->
                        book.getName().equals("Reactive Programming"))
                .verifyComplete();
    }
    
    @Test
    void testSaveBook() {

        Book book = new Book(1L, "Java", 500);

        when(repo.save(book))
                .thenReturn(Mono.just(book));

        StepVerifier.create(service.saveBook(book))
                .expectNext(book)
                .verifyComplete();
    }
    
}
