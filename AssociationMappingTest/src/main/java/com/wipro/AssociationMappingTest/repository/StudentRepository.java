package com.wipro.AssociationMappingTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.AssociationMappingTest.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
