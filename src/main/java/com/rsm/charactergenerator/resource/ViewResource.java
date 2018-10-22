package com.rsm.charactergenerator.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewResource {

    @GetMapping("/")
    public String index() {
        return "index.html";
    }
}
