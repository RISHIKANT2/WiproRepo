package com.wipro.UserService.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wipro.UserService.dto.Product;
import com.wipro.UserService.repository.entity.User;
import com.wipro.UserService.service.UserService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	RestTemplate resttemplate;

	@Autowired
	UserService service;
	
	 Logger logger = LoggerFactory.getLogger(UserController.class);

	@PostMapping
	public User saveUser(@RequestBody User user) {
		return service.registerUser(user);
	}

	// Map<String, Object> map=new HashMap<>();
	// map.put("user" , new User());
	// mpa.put("product" ,new Product());

	// User , Product
	 @CircuitBreaker(name = "userService", fallbackMethod = "getUserFallback")
	@GetMapping("/{userid}")
	public Map<String, Object> getUserandProduct(@PathVariable int userid) {

		User userobj = service.getUser(userid).orElse(null);
		
		logger.info("******************Inside User Service**************************");

		String url = "http://J2EEPRODUCTSERVICE/product/"+userobj.getProductid();
		Product prodobj = resttemplate.getForObject(url, Product.class);

		Map<String, Object> map = new HashMap<>();
		map.put("User", userobj);
		map.put("Product", prodobj);
		return map;

	}
	
	 public Map<String, Object> getUserFallback(int userid, Exception e) {
		 User userobj = service.getUser(userid).orElse(null);

	        Map<String, Object> map = new HashMap<>();

	        map.put("User", userobj);
	        map.put("Product", "Product Service is down");

	        return map;
	    }
	
}
