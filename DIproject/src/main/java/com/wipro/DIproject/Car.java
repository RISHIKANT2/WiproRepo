package com.wipro.DIproject;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle{
	 public void start() {
		 System.out.println("Car is starting....");
	 }

}
