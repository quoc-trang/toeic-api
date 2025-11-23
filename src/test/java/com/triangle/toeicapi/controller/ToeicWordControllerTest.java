package com.triangle.toeicapi.controller;

import com.triangle.toeicapi.model.ToeicWord;
import com.triangle.toeicapi.service.ToeicWordService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@WebMvcTest(ToeicWordController.class)
public class ToeicWordControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private ToeicWordService service;

    @Test
    void getAllWords_ShouldReturnList() throws Exception {

        ToeicWord word1 = new ToeicWord("contract", "hợp đồng", "They signed the contract yesterday.");
        ToeicWord word2 = new ToeicWord("schedule", "lịch trình", "Check the schedule for next week.");

        when(service.findAllWords()).thenReturn(List.of(word1, word2));

        mockMvc.perform(get("/api/words"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].word").value("contract"))
                .andExpect(jsonPath("$[1].word").value("schedule"));
    }
}
