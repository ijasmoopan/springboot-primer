package com.ijas.spring_primer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringPrimerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPrimerApplication.class, args);
	}

	@GetMapping
	public String HealthCheck() {
		return "{" +
				"message: Service up and running" +
				"}";
	}

}
