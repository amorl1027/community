package com.huazi.community.dto;

import com.huazi.community.model.User;
import lombok.Data;

/**
 * @Title: QuestionDto
 * @Description: com.huazi.community.dto
 * @Author: 郭华振
 * @version: 1.0.0
 **/
@Data
public class QuestionDto {
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
    private User user;
}
