package com.hongjun.webservice.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class WebController {

    @RequestMapping("/")
    public String main() {
        return "main";
    }
}
