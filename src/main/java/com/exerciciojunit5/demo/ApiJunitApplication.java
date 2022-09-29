package com.exerciciojunit5.demo;

import com.exerciciojunit5.demo.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiJunitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiJunitApplication.class, args);

		User user = new User(1,"Francisco","Josecdia@gmail.com","Jose19872828");

		System.out.println(user);
	}

}
