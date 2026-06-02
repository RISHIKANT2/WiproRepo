package com.wipro.ReactiveDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ReactiveDemo.model.Book;
import com.wipro.ReactiveDemo.model.User;
import com.wipro.ReactiveDemo.repository.UserRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

	
	@Autowired
	UserRepo repo;
	
	
	public Mono<User>  addUser(User obj)
	{
		
		return repo.save(obj);
	}
	
  public Flux<User> getUser()
	  
	  {
		 
		 return repo.findAll();
	  }
	  
	  public Mono<User> getSingleUser(int id)
	  {
		  return repo.findById(id);
	  }
}
