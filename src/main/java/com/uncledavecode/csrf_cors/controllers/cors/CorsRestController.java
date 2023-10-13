package com.uncledavecode.csrf_cors.controllers.cors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cors-works")
public class CorsRestController {

    @GetMapping
    public String getCors() {
        return "CORS works!";
    }
}
