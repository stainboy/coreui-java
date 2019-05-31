package com.sap.scaffold;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    Environment env;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
