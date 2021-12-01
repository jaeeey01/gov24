package com.exam.gov24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Gov24Application {

    public static void main(String[] args) {
        SpringApplication.run(Gov24Application.class, args);
    }

}
