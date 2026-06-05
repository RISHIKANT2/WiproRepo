package com.wipro.employeeCrud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping("/hello")
	public String[] hello(Model obj) {
		
		
		return new String[] {"Rishikant Pravesh","Prasahnt Bharadwaj","Rohit Kumar"};
	}
	@PostMapping("/add")
	public Object addUser(@RequestBody Object obj) {
		
	
		return obj;
	}
	@PutMapping("/update")
	public String updateUser(@RequestParam String name) {
		
	
		return "The user with name: "+name+" is updated";
	}
	@DeleteMapping("/delete/{id}")
	public String updateUser(@PathVariable int id) {
		
	
		return "The user with id: "+id+" is deleted";
	}
}
