package com.wipro.AssociationMappingTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.AssociationMappingTest.entity.Jobs;

@Repository
public interface JobRepo extends JpaRepository<Jobs, Integer>{

}
