package com.metroride.MetroRide_Java_API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetroController {

    @GetMapping("/metro/timings")
    public String getMetroTimings() {
        return "MetroRide API: Next metro arrives in 5 minutes.";
    }
}
