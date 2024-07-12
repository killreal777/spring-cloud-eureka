package org.micro.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EurekaClientApplication {

    @Value("${eureka.instance.instance-id}")
    private String id;

    @RequestMapping("/")
    public String home() {
        return "Home";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, Eureka!";
    }

    @RequestMapping("/test")
    public String test() {
        return id;
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
