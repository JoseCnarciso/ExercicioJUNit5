package com.exerciciojunit5.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiJunitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiJunitApplication.class, args);

		System.out.println("Ola povo");
	}

}
