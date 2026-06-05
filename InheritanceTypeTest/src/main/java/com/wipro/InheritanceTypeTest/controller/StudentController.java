package com.wipro.InheritanceTypeTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.InheritanceTypeTest.entity.Boy;
import com.wipro.InheritanceTypeTest.entity.Girl;
import com.wipro.InheritanceTypeTest.entity.Student;
import com.wipro.InheritanceTypeTest.service.StudentService;

@RestController
@RequestMapping("/wipro")
public class StudentController {

	@Autowired
	StudentService service;
	
	
	@GetMapping("/welcome")
	  String getMessage()
	  {
		return "welcome to wipro app!";
	  }
	
	

	@GetMapping("/users")
	  List<Student> getUsers()
	  {
	   return service.getAllUser();
	  }
	
	
	@PostMapping("/girl")
	  Student signupUser( @RequestBody  Girl obj)
	  {
	   return    service.saveUserGirl(obj);
	  }
	@PostMapping("/boy")
	  Student signupBoy( @RequestBody  Boy obj)
	  {
	   return    service.saveUSERbOY(obj);
	  }
	
}

