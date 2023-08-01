package com.ananda.springcore;

import com.ananda.springcore.component.Animal;
import com.ananda.springcore.component.ApplicationContextProvider;
import com.ananda.springcore.component.Duck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		System.out.println("Starting Spring Context...");
		SpringApplication.run(SpringCoreApplication.class, args);
		ApplicationContext context = ApplicationContextProvider.getApplicationContext();

		Animal animal = context.getBean(Animal.class);
		System.out.println("Animal : " + animal);

		Animal animal1 = context.getBean(Animal.class);
		System.out.println("Animal : " + animal1);

		Duck duck = context.getBean(Duck.class);
		duck.fly();

	}

}
