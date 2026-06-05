package com.wipro.InheritanceTypeTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.InheritanceTypeTest.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
