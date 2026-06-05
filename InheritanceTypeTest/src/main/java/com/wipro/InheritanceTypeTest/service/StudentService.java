package com.wipro.InheritanceTypeTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.InheritanceTypeTest.entity.Boy;
import com.wipro.InheritanceTypeTest.entity.Girl;
import com.wipro.InheritanceTypeTest.entity.Student;
import com.wipro.InheritanceTypeTest.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo stdRepo;

	public Student saveUserGirl(Girl obj) {
	
		return stdRepo.save(obj);
	}
	public Student saveUSERbOY(Boy obj) {
		
		return stdRepo.save(obj);
	}


	public List<Student> getAllUser() {
		return stdRepo.findAll();
	}
}
