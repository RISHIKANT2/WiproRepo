package com.wipro.ReactiveDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ReactiveDemo.model.Book;
import com.wipro.ReactiveDemo.repository.BookRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {
	
	@Autowired
	BookRepository  repo;

	public Mono<Book>  addBook(Book obj)
	{
		
		return repo.save(obj);
	}
	
  public Flux<Book> getBook()
	  
	  {
		 
		 return repo.findAll();
	  }
	  
	  public Mono<Book> getSingleBook(int id)
	  {
		  return repo.findById(id);
	  }
	  
	  public Mono<String> updateBook(int id, Book book){
		  return repo.findById(id)
          .switchIfEmpty(
                  Mono.error(new RuntimeException("Book not found"))
          )
          .flatMap(existingBook -> {

              existingBook.setName(book.getName());
              existingBook.setPrice(book.getPrice());
              existingBook.setPublisher(book.getPublisher());

              return repo.save(existingBook);
          })
          .then(Mono.just("Book updated successfully"));
	  }
	  
	  public Mono<String> deleteBookById(int id){
		  return repo.findById(id)
				  .switchIfEmpty(
						  Mono.error(new RuntimeException("Book not found"))
						  ).flatMap(book -> 
		                    repo.delete(book)
	                        .then(Mono.just("Book deleted successfully"))
	            );	  
		  }
}
