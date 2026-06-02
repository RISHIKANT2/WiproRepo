package com.wipro.DIproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	@Bean
	public Address address() {
		Address obj=new Address();
		obj.setCity("Bokaro Steel City");
		return obj ;
	}
	@Bean
	public Student student() {
		return new Student("rishikant",32,address());
	}
}
