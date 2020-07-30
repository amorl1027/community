package com.huazi.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Title: HelloController
 * @Description: com.huazi.community.controller
 * @Author: 郭华振
 * @version: 1.0.0
 **/
@Controller
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
