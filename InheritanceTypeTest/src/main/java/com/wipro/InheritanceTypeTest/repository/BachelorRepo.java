package com.wipro.InheritanceTypeTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.InheritanceTypeTest.entity.Bachelor;

@Repository
public interface BachelorRepo extends JpaRepository<Bachelor, Integer>{

}
