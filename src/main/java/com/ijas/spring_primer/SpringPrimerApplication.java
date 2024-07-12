package com.ijas.spring_primer;

import com.ijas.spring_primer.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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
