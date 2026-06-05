package com.wipro.ReactiveDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class ReactiveDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveDemoApplication.class, args);
		
		
		
	}
	
	  public static Mono<String> getData() {
	        // Simulate an error scenario
	    	double number=Math.random();
	        if (number < 0.5) {
				return Mono.error(new RuntimeException("Error occurred!"+number));
	        } else {
	            return Mono.just("Success!"+number);
	        }
	    }

}
