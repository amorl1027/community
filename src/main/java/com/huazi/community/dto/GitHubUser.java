package com.huazi.community.dto;

import lombok.Data;

/**
 * @Title: GitHubUser
 * @Description: com.huazi.community.dto
 * @Author: 郭华振
 * @version: 1.0.0
 **/
@Data
public class GitHubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
