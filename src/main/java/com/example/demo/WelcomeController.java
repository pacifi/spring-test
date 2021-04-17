package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
@Component
public class WelcomeController {

    @Value("${application.message:Hello World}")
    private String helloMessage;

    @GetMapping("/jsp")
    public String welcome(Map<String, Object> model) {

        model.put("message", helloMessage);

        return "welcome";
    }
}