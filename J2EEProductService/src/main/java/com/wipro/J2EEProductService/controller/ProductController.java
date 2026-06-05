package com.wipro.J2EEProductService.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.J2EEProductService.entity.Product;
import com.wipro.J2EEProductService.service.ProductService;


//@CrossOrigin("http://localhost:5173/")
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService service;
	
	
	Logger logger = LoggerFactory.getLogger(ProductController.class);

	@PostMapping
	public Product saveUser(@RequestBody Product user) {
		return service.registerProduct(user);
		
		
	}

	@GetMapping("/all")
	public List<Product> getUser() {
		return service.getProducts();
	}
	@GetMapping("{id}")
	public Product getProduct(@PathVariable  long id) {
		 logger.info("**************Inside Product Service****************");
		return service.getProduct(id).orElse(null);
	}
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable long id, @RequestBody Product product) {

	    product.setProductid(id);   // set id from path
	    return service.updateProduct(id,product);  // or save logic
	}
}
