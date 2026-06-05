package com.wipro.UserService.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;




@Entity

public class User {
	@Id
  long id;
  String name,password,email;
  int productid;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
} 
	
	
	
}
