package com.uncledavecode.csrf_cors.controllers.csrf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/csrf")
@Slf4j
public class CsrfController {

    @GetMapping
    public String getCsrf() {
        return "csrf/index";
    }

    @PostMapping
    public String postCsrf() {
        log.info("POST request received!!!");
        return "csrf/index";
    }
}
