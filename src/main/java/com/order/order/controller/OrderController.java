package com.order.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/users")
    public String getUsersFromUserService() {
        return restTemplate.getForObject("http://user/users", String.class);
    }
}
