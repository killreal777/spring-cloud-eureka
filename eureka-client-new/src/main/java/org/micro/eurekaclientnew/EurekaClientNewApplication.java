package org.micro.eurekaclientnew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableFeignClients
public class EurekaClientNewApplication {

    @Autowired
    private EurekaClientFeignClient eurekaClientFeignClient;

    @RequestMapping("/another")
    public String another() {
        return "Run test from another service: " + eurekaClientFeignClient.test();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientNewApplication.class, args);
    }

}
