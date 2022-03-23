package com.example.lbms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
            return args -> {
                Student student1 = new Student("Abella",
                        13,
                        "CSE",
                        350.00,
                        "abella99@gmail.com"

                );
                Student student2 = new Student(
                        "Alex",
                        13,
                        "ECE",
                        300.00,
                        "abella99@gmail.com"

                );
                studentRepository.insert(student1);
            };
    }
}
