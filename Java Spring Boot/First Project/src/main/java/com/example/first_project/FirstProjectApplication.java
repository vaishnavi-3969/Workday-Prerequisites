package com.example.first_project;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		//initializing container
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjectApplication.class, args);
		System.out.println("Welcome to Spring Boot.....");
		//this object will be available in spring container
		Alien a = context.getBean(Alien.class);
		a.show();
		Alien b = context.getBean(Alien.class);
		b.show();
	}
}
