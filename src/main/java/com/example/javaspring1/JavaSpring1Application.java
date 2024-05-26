package com.example.javaspring1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class JavaSpring1Application {

    public static void main(String[] args) {
        food foodnum = new food();
        System.out.println(food.foodnum(4));
        SpringApplication.run(JavaSpring1Application.class, args);
    }
}