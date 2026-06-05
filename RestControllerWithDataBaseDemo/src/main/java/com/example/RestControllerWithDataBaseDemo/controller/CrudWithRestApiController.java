package com.example.RestControllerWithDataBaseDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestControllerWithDataBaseDemo.entity.User;
import com.example.RestControllerWithDataBaseDemo.service.UserService;

@RestController
public class CrudWithRestApiController {
	
		@Autowired
		UserService service;
		
		@GetMapping("/{id}")
		public String getUser(@PathVariable int id)
		{
			
			Optional<User>   userop=service.getUser(id);
			if(userop.isPresent())
			{
				return "user found : " +userop.get();
			}
			else
			return "user not found!";
		}
		
		@GetMapping("/all")
		public List<User> getUsers()
		{
			return service.getAll();
		}
		
		
		@PostMapping("/add")
		public User addUser(@RequestBody User  obj)
		{
			return  service.addUser(obj);
			
		}
		@DeleteMapping("/{id}")
		public Object deleteUser(@PathVariable int id)
		{
			
			 service.deleteUser(id);
			return "User with id: "+id+" is deleted!";
			
		}
		@PostMapping("/byName")
		public User findByName(@RequestParam String name) {
			return service.getUserByName(name);
					
		}
		@DeleteMapping("/deletebyName")
		public String deleteByName(@RequestParam String name) {
		    service.deleteByName(name);
		    return "User with name: "+name+" is deleted!";	
		}
		
		@PutMapping("/{id}")
		public Object updateUser(@PathVariable int id, @RequestBody Object  obj)
		{
			return "user with id: "+id+" is updated : "+obj;
			
		}

		@PatchMapping("/{id}")
		public Object updateUserPartially(@PathVariable int id, @RequestParam String  name)
		{
			return "user with id: "+id+" is updated : "+name;
			
		}

}
