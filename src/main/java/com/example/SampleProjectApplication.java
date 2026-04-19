package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleProjectApplication.class, args);
        
        System.out.println("this is simple spring boot application");
    }

    @GetMapping("/hello")
    public String home() {
        return "Hello Jenkins this is sharath kumar";
    }
    
    
    @GetMapping("/welcome")
    public String welcome() {
        return "Hello this is simple welcome message";
    }
    
    @GetMapping("/qa")
    public String environment() {
        return "Hello this is qa environment and you need to merge to master asap";
    }
    
    @GetMapping("/master")
    public String doCode() {
        return "Hello this is master environment changes ......";
    }
    
    
}
