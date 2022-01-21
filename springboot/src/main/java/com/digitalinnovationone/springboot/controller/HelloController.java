package com.digitalinnovationone.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/minhaprimeiraaplicacaospring")
    public String helloMessage(){
        return "Hello, Digital Innovation One!";
    }
}
