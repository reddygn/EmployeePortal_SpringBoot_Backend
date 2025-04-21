package com.example.dummy.backend.api;


import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Naveen Reddy
 * Date:4/19/2025
 * Time:7:29 PM
 */


@RestController

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class LoginDetails {

    @GetMapping("/login/details/{username}/{password}")
    public Map<String, String> getLoginDetails(@PathVariable String username, @PathVariable String password) {

        System.out.println("received user request with username: " + username + " and password: " + password);

        if (username.equals("admin") && password.equals("admin")) {
            return Map.of("status", "success", "message", "Login successful");
        } else {
            return Map.of("status", "failure", "message", "Invalid credentials");
        }
    }

    @GetMapping("/details/info")
    public Map<String, String> getLoginDetailsInfo() {
        Map<String, String> map = new HashMap<>();

        map.put("First Name", "Naveen");
        map.put("Last Name", "Reddy");

        return map;
    }
}


