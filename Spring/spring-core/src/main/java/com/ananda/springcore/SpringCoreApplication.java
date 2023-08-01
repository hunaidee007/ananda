package com.ananda.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		System.out.println("Starting Spring Context...");
		SpringApplication.run(SpringCoreApplication.class, args);
	}

}
