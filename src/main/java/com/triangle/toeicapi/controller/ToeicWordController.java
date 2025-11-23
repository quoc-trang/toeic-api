package com.triangle.toeicapi.controller;

import com.triangle.toeicapi.model.ToeicWord;
import com.triangle.toeicapi.service.ToeicWordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/words")
public class ToeicWordController {

    private final ToeicWordService service;

    public ToeicWordController(ToeicWordService service) {
        this.service = service;
    }

    @GetMapping
    public List<ToeicWord> getAllWords() {
        return service.findAllWords();
    }
}