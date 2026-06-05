package com.wipro.InheritanceTypeTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.InheritanceTypeTest.entity.Worker1;
import com.wipro.InheritanceTypeTest.repository.WorkerRepo;

@Service
public class WorkerService {

	
	@Autowired
	WorkerRepo wrkRepo;
	
	public Worker1 saveWorker(Worker1 obj) {
		return wrkRepo.save(obj);
	}
}
