package com.lnt.springbootdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class testController {
    
    @GetMapping("/")
    public String sayHello(){
        return "Hello web, Welcome to home page.";
    }
}
