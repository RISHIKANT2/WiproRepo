package com.wipro.InheritanceTypeTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.InheritanceTypeTest.entity.Bachelor;
import com.wipro.InheritanceTypeTest.repository.BachelorRepo;

@RestController
public class BachelorController {
	
	@Autowired
	BachelorRepo bcrepo;
	
	@PostMapping("/bachelor")
	public Bachelor addbachelor(@RequestBody Bachelor obj) {
		return bcrepo.save(obj);
	}

}
