package com.question.controller;

import com.question.entity.Question;
import com.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }
    @GetMapping
    public List<Question>get(){
        return questionService.get();
    }
    @GetMapping("/{questionId}")
    public Question getOne(@PathVariable long questionId){
        return questionService.getOne(questionId);
    }


    @GetMapping("/quiz/{quizId}")
    public List<Question> getquestionsofquiz(@PathVariable long quizId){
        return questionService.getQuestionsOfQuiz(quizId);
    }
}
