package com.example.studentsmanagementapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StudentsManagementApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(StudentsManagementApplication.class, args);
        System.out.println("Student App Started");
        System.out.println("Successful");
    }

}
