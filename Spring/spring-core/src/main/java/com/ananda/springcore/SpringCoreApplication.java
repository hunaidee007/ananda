package com.ananda.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringCoreApplication {

	public static void main(String[] args) {
		System.out.println("Starting Spring Context...");
		SpringApplication.run(SpringCoreApplication.class, args);
		/*ApplicationContext context = ApplicationContextProvider.getApplicationContext();

		Animal animal = context.getBean(Animal.class);
		System.out.println("Animal : " + animal);

		Animal animal1 = context.getBean(Animal.class);
		System.out.println("Animal : " + animal1);

		Duck duck = context.getBean(Duck.class);
		duck.fly();*/

	}

}
