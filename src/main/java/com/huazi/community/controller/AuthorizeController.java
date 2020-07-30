package com.huazi.community.controller;

import com.huazi.community.dto.AccessTokenDTO;
import com.huazi.community.dto.GitHubUser;
import com.huazi.community.provider.GitHubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Title: AuthorizeController
 * @Description: com.huazi.community.controller
 * @Author: 郭华振
 * @version: 1.0.0
 **/
@Controller
public class AuthorizeController {
    @Autowired
    private GitHubProvider gitHubProvider;

    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return "123";
    }

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state")String state) {
        System.out.println("start");
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id("262e6157d00426928801");
        accessTokenDTO.setClient_secret("510211dd4d10601874de41835a94419ed991103e");
        accessTokenDTO.setState(state);
        accessTokenDTO.setRedirect_uri("http://localhost:8887/callback");
        accessTokenDTO.setCode(code);

        String accessToken = gitHubProvider.getAccessToken(accessTokenDTO);
        GitHubUser user = gitHubProvider.getUser(accessToken);
        System.out.println(user.getName());
        System.out.println(user.toString());
        return "index";
    }
}
