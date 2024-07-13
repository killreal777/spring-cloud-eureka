package org.micro.eurekaclientnew;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client")
public interface EurekaClientFeignClient {

    @RequestMapping("/")
    public String home();

    @RequestMapping("/hello")
    public String hello();

    @RequestMapping("/test")
    public String test();
}
