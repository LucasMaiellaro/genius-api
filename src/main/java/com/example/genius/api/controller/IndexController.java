package com.example.genius.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String get() {
        return "Genius API";
    }


}
