package com.example.mongoDbSpringConfig.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongoDbSpringConfig.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long>{

	
}
