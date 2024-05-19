package com.insightscode;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PublisherApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(PublisherApplication.class, args);
    }

    public void run(String... args) throws Exception {
    }
}
