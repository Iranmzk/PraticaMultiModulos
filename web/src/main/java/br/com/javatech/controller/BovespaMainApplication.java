package br.com.javatech.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"br.com.javatech.*"})
@EntityScan(basePackages = {"br.com.javatech.*"})
@EnableMongoRepositories(basePackages = {"br.com.javatech.*"})
public class    BovespaMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(BovespaMainApplication.class);
    }
}
