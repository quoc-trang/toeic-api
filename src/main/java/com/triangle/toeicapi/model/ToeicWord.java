package com.triangle.toeicapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class ToeicWord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String word;
    private String meaning;
    private String exampleSentence;

    public ToeicWord() {
    }

    public ToeicWord(String word, String meaning, String exampleSentence) {
        this.word = word;
        this.meaning = meaning;
        this.exampleSentence = exampleSentence;
    }
}