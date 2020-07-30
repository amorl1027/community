package com.huazi.community.dto;

/**
 * @Title: GitHubUser
 * @Description: com.huazi.community.dto
 * @Author: 郭华振
 * @version: 1.0.0
 **/
public class GitHubUser {
    private String name;
    private Long id;
    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
