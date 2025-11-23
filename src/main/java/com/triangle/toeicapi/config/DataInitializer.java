package com.triangle.toeicapi.config;

import com.triangle.toeicapi.model.ToeicWord;
import com.triangle.toeicapi.repository.ToeicWordRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData(ToeicWordRepository repository) {
        return args -> {
            repository.save(new ToeicWord( "contract", "hợp đồng", "They signed the contract yesterday."));
            repository.save(new ToeicWord( "schedule", "lịch trình", "Check the schedule for next week."));
            repository.save(new ToeicWord( "requirement", "yêu cầu", "Please share the requirement document."));
            repository.save(new ToeicWord( "opportunity", "cơ hội", "He saw a great opportunity ahead of him."));
        };
    }
}