package com.wipro.J2EEProductService.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.J2EEProductService.entity.Product;
import com.wipro.J2EEProductService.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository repository;

	
	
	     public Product registerProduct(Product obj)
	     {
	    	 return repository.save(obj);
	    	 
	     }
	
	       public List<Product> getProducts()
	       {
	    	   return repository.findAll();
	       }
	
	       public Optional<Product> getProduct(long id)
	       {
	    	   return repository.findById(id);
	       }
	   
	       public Product updateProduct(long id, Product product) {

	           Product existingProduct = repository.findById(id).orElse(null);

	           if (existingProduct != null) {
	               existingProduct.setName(product.getName());
	               
	               existingProduct.setPrice(product.getPrice());
	               

	               return repository.save(existingProduct);
	           }

	           return null;   // better to throw exception (I’ll show below)
	       }
}

