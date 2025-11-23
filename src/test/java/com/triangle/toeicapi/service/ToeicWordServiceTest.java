package com.triangle.toeicapi.service;

import com.triangle.toeicapi.model.ToeicWord;
import com.triangle.toeicapi.repository.ToeicWordRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ToeicWordServiceTest {

    @Mock
    private ToeicWordRepository repository;

    @InjectMocks
    private ToeicWordService service;

    @Test
    void findAllWords_ShouldReturnListOfWords(){
        // GIVEN
        ToeicWord word1 = new ToeicWord("contract", "hợp đồng", "They signed the contract.");
        ToeicWord word2 = new ToeicWord("schedule", "lịch trình", "Check the schedule.");

        when(repository.findAll()).thenReturn(List.of(word1, word2));

        // WHEN
        List<ToeicWord> result = service.findAllWords();

        // THEN
        assertEquals(2, result.size());
        assertEquals("contract", result.get(0).getWord());
        assertEquals(word2, result.get(1));

    }
}
