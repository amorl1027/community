package com.huazi.community.model;

import lombok.Data;

/**
 * @Title: User
 * @Description: com.huazi.community.model
 * @Author: 郭华振
 * @version: 1.0.0
 **/
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
