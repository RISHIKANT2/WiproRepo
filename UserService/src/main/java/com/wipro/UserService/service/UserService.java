package com.wipro.UserService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.UserService.repository.UserRepository;
import com.wipro.UserService.repository.entity.User;

@Service
public class UserService {
	@Autowired
	UserRepository repository;

	
	
	     public User registerUser(User obj)
	     {
	    	 return repository.save(obj);
	    	 
	     }
	
	       public Optional<User> getUser(long id)
	       {
	    	   return repository.findById(id);
	       }
	
	
}
