package com.fernandez.redirection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RedirectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedirectionApplication.class, args);
	}

}
