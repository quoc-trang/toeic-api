package com.triangle.toeicapi.service;

import com.triangle.toeicapi.model.ToeicWord;
import com.triangle.toeicapi.repository.ToeicWordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToeicWordService {

    private final ToeicWordRepository repository;

    public ToeicWordService(ToeicWordRepository repository) {
        this.repository = repository;
    }

    public List<ToeicWord> findAllWords() {
        return repository.findAll();
    }
}
