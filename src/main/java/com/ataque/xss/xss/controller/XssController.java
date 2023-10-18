package com.ataque.xss.xss.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class XssController {
       @PostMapping("/")
        public void handleRequest(@RequestHeader("Authorization") String token, @RequestBody String body) {
            System.out.println("Token: " + token);
            System.out.println("Corpo: " + body);
            System.out.println("---------");
        }
}
