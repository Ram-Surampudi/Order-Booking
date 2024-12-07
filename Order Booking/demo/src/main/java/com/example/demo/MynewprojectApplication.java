package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
public class MynewprojectApplication {

	public static void main(String[] args) {
		System.out.println("testing application is running at 8081");
		SpringApplication.run(MynewprojectApplication.class, args);
	}
}
