package com.wipro.J2EEProductService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.J2EEProductService.entity.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
