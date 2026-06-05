package com.wipro.AssociationMappingTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.AssociationMappingTest.entity.Student;
import com.wipro.AssociationMappingTest.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository stdrepo;
	
	@PostMapping("/std")
	public Student addStudent(@RequestBody Student obj) {
		return stdrepo.save(obj);
	}

}
