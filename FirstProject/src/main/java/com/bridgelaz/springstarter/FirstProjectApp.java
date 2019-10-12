package com.bridgelaz.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//This tells the spring boot that this is the starting point of the app
@SpringBootApplication

public class FirstProjectApp {

	public static void main(String[] args) {
		// args var is just a pass through
		SpringApplication.run(FirstProjectApp.class, args);
	}

}
