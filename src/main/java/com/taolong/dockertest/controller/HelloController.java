package com.taolong.dockertest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello docker springboot";
    }
    @GetMapping("/helloAdd")
    public String helloAdd(){
        return "hello add";
    }




    @GetMapping("/helloremote")
    public String helloRemote(){
        return "hello helloremote";
    }
}
