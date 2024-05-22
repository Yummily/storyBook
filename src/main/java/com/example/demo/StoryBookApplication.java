package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "controller")
public class StoryBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoryBookApplication.class, args);
	}

}
