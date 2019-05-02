package com.demo.emailApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmailApiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EmailApiApplication.class, args);
	}

}
