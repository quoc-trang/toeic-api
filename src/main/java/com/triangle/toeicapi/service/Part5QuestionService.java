package com.triangle.toeicapi.service;

import com.triangle.toeicapi.model.Part5Question;
import com.triangle.toeicapi.repository.Part5QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Part5QuestionService {

    private final Part5QuestionRepository repository;

    public Part5QuestionService(Part5QuestionRepository repository) {
        this.repository = repository;
    }

    public List<Part5Question> findAllQuestions() {
        return repository.findAll();
    }
}
