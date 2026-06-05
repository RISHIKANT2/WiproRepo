package com.wipro.DIproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	
	
	@Autowired
	private Vehicle v_choice;
	
	public void start() {
		v_choice.start();
	}

}
