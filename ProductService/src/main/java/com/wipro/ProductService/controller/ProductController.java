package com.wipro.ProductService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.ProductService.entity.Product;
import com.wipro.ProductService.service.ProductService;

@RestController
public class ProductController {

	
	@Autowired
	ProductService serv;
	
	
	@PostMapping("/product")
	public Product saveProd(@RequestBody Product prod ) {
		return serv.savePorduct(prod);
	}
	
	@GetMapping("/products")
	public List<Product> getAll(){
		return serv.getAllProd();
	}
}
