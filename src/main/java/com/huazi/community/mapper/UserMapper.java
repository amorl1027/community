package com.huazi.community.mapper;

import com.huazi.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Title: UserMapper
 * @Description: com.huazi.community.mapper
 * @Author: 郭华振
 * @version: 1.0.0
 **/
@Mapper
public interface UserMapper {
    @Insert("insert into \"Test\".user (name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);

}
