package com.huazi.community.controller;

import com.huazi.community.dto.QuestionDto;
import com.huazi.community.mapper.QuestionMapper;
import com.huazi.community.mapper.UserMapper;
import com.huazi.community.model.Question;
import com.huazi.community.model.User;
import com.huazi.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    @Autowired
    private QuestionService questionService;


    @GetMapping("/")
    public String index(HttpServletRequest request, Model model) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length != 0)
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

        System.out.println("this is a test");
        List<QuestionDto> questionDtoList = questionService.list();
        model.addAttribute("questions", questionDtoList);
        return "index";
    }
}
