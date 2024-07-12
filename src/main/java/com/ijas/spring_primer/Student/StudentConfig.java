package com.ijas.spring_primer.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student s1 = new Student(
                    "Ijas",
                    "ijasmoopan46@gmail.com",
                    LocalDate.of(2000, Month.JUNE, 4)
            );

            Student s2 = new Student(
                    "Test User 1",
                    "test1@gmail.com",
                    LocalDate.of(2004, Month.JUNE, 4)
            );

            repository.saveAll(List.of(s1, s2));
        };
    }
}
