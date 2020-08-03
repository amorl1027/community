package com.huazi.community.controller;

import com.huazi.community.mapper.UserMapper;
import com.huazi.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @Title: IndexController
 * @Description: com.huazi.community.controller
 * @Author: 郭华振
 * @version: 1.0.0
 **/
@Controller
public class IndexController {
    @Autowired
    private UserMapper userMapper;


    @GetMapping("/")
    public String index(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("token")) {
                String token = cookie.getValue();
                User user = userMapper.findByToken(token);
                if (user != null) {
                    request.getSession().setAttribute("user", user);
                }
                break;
            }
        }
        return "index";
    }
}
