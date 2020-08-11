package com.huazi.community.service;

import com.huazi.community.dto.QuestionDto;
import com.huazi.community.mapper.QuestionMapper;
import com.huazi.community.mapper.UserMapper;
import com.huazi.community.model.Question;
import com.huazi.community.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: QuestionService
 * @Description: com.huazi.community.service
 * @Author: 郭华振
 * @version: 1.0.0
 **/
@Service
public class QuestionService {
    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;


    public List<QuestionDto> list() {
        List<Question> questionList = questionMapper.list();
        List<QuestionDto> questionDtoList = new ArrayList<>();
        for (Question question : questionList) {
            User user = userMapper.findById(question.getCreator());
            QuestionDto questionDto = new QuestionDto();
            BeanUtils.copyProperties(question, questionDto);
            questionDto.setUser(user);
            questionDtoList.add(questionDto);

        }
        return questionDtoList;
    }


}
