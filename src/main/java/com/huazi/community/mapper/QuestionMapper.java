package com.huazi.community.mapper;

import com.huazi.community.model.Question;
import com.huazi.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Title: UserMapper
 * @Description: com.huazi.community.mapper
 * @Author: 郭华振
 * @version: 1.0.0
 **/
@Mapper
public interface QuestionMapper {
    @Insert("insert into \"Test\".question (title,description,gmt_create,gmt_modified,creator,tag)  values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    void insert(Question question);

}
