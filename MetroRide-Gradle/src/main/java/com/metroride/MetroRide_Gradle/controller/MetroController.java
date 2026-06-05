package com.metroride.MetroRide_Gradle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetroController {

	@GetMapping("/metro")
    public String metro() {
        return "Metro arriving in 5 minutes";
    }
}
