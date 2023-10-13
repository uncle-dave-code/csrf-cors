package com.uncledavecode.csrf_cors.controllers.cors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CorsController {

    @GetMapping("/cors")
    public String getCors() {
        return "cors/index";
    }
}
