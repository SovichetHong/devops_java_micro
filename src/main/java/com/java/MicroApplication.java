package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroApplication {

	@GetMapping
	public String message(){
		return "Welcome to my micro service application!";
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroApplication.class, args);
	}

}
