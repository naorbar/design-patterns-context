package com.ca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		System.out.println("start app...");
		SpringApplication.run(StartApplication.class, args);
		System.out.println("end app...");
	}
}
