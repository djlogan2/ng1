package com.davidlogan.nextgen.springdatatest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringdatatestApplication {

    private final MongoTest mongoTest;

    public static void main(String[] args) {
        SpringApplication.run(SpringdatatestApplication.class, args);
    }

    @Autowired
    public SpringdatatestApplication(MongoTest mongoTest) {
        this.mongoTest = mongoTest;
    }

    @GetMapping("/hello")
    public String helloWorld() {
        mongoTest.getRecords();
        return "Hello world";
    }
}
