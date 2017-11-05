package com.store.webstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.store.webstore")
public class WebstoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebstoreApplication.class, args);
	}
}
