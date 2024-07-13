package org.micro.eurekaclientnew;

import org.micro.eurekaclientapi.EurekaClientApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client")
public interface EurekaClientFeignClient extends EurekaClientApi {

//    @RequestMapping("/")
//    public String home();
//
//    @RequestMapping("/hello")
//    public String hello();
//
//    @RequestMapping("/test")
//    public String test();
}
