package com.wipro.InheritanceTypeTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.InheritanceTypeTest.entity.Worker1;

@Repository
public interface WorkerRepo extends JpaRepository<Worker1, Integer>{

}
