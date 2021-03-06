package com.huazi.community.model;

import lombok.Data;

/**
 * @Title: Question
 * @Description: com.huazi.community.model
 * @Author: 郭华振
 * @version: 1.0.0
 **/
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}
