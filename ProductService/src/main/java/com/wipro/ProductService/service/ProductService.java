package com.wipro.ProductService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ProductService.entity.Product;
import com.wipro.ProductService.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo prdRepo;
	
	
	public Product savePorduct(Product prod) {
		return prdRepo.save(prod);
	}
	
	public List<Product> getAllProd(){
		return prdRepo.findAll();
	}

}
