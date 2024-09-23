package com.basic.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
        public String hello(){
           return "hello";
        }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("user")
    public String userEndpoint(){
        return "hello user";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("admin")
    public String adminEndpoint(){
        return "hello admin";
    }
}
