package com.example.firstspringbootapplication;

import org.springframework.boot.SpringApplication;

public class TestFirstspringbootapplicationApplication {

    public static void main(String[] args) {
        SpringApplication.from(FirstspringbootapplicationApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
