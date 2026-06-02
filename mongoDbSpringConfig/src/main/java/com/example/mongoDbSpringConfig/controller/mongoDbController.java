package com.example.mongoDbSpringConfig.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongoDbSpringConfig.entity.Product;
import com.example.mongoDbSpringConfig.exception.ProductNotFound;
import com.example.mongoDbSpringConfig.repository.ProductRepository;

@RestController
public class mongoDbController {

	
	@Autowired
	ProductRepository repo;

	@PostMapping("/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
		Product newProduct = repo.save(product);
		return ResponseEntity.ok(newProduct);
	}

	// Get all products.

	    @GetMapping("/products")
	    public ResponseEntity<List<Product>> getAllProducts() {
	        return ResponseEntity.ok(repo.findAll());
	    }
	    
	    @GetMapping("/products/{id}")
	    public Product getProductById(@PathVariable Long id) {
	        return repo.findById(id).orElseThrow(()->new ProductNotFound("Message: product is not found!"));

	        
	    }
}
