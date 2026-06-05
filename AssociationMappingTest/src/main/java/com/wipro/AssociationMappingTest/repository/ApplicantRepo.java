package com.wipro.AssociationMappingTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.AssociationMappingTest.entity.Applicant;

@Repository
public interface ApplicantRepo extends JpaRepository<Applicant, Integer> {

}
