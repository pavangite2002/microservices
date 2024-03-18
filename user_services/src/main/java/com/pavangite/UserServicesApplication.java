package com.pavangite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServicesApplication.class, args);
	}

	// here we are using RestTemplate to connect bet two microservices synchronously
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
