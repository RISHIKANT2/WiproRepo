package com.wipro.J2EEProductService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class J2EeProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(J2EeProductServiceApplication.class, args);
	}

}
