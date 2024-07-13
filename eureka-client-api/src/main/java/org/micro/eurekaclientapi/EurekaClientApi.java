package org.micro.eurekaclientapi;

import org.springframework.web.bind.annotation.RequestMapping;

public interface EurekaClientApi {

    @RequestMapping("/")
    public String home();

    @RequestMapping("/hello")
    public String hello();

    @RequestMapping("/test")
    public String test();

}
