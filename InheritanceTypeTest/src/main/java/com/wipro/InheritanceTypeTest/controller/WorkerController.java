package com.wipro.InheritanceTypeTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.InheritanceTypeTest.entity.Worker1;
import com.wipro.InheritanceTypeTest.service.WorkerService;

@RestController
public class WorkerController {
	
	@Autowired
	WorkerService serv;
	
	@PostMapping("/addWorker")
	public Worker1 addWorker(@RequestBody Worker1 obj) {
		return serv.saveWorker(obj);
	}

}
