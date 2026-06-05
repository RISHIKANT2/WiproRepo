package com.wipro.J2EEProductService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity

public class Product {
	@Id
	Long productid;
	
	String name;
	int price;
	public Long getProductid() {
		return productid;
	}
	public void setProductid(Long productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
