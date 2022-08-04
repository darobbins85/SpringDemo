package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student david = new Student(
                    "David",
                    "drob@apple.com",
                    LocalDate.of(1985, NOVEMBER, 3)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@apple.com",
                    LocalDate.of(1995, JANUARY, 1)
            );

            repository.saveAll(List.of(david, alex));
        };
    }
}
