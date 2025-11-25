package com.triangle.toeicapi.controller;

import com.triangle.toeicapi.model.Part5Question;
import com.triangle.toeicapi.service.Part5QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/part5")
public class Part5QuestionController {

    private final Part5QuestionService service;

    public Part5QuestionController(Part5QuestionService service) {
        this.service = service;
    }

    @GetMapping
    public List<Part5Question> getAllQuestions() {
        return service.findAllQuestions();
    }
}
