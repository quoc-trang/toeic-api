package com.triangle.toeicapi.repository;

import com.triangle.toeicapi.model.Part5Question;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Part5QuestionRepository extends JpaRepository<@NonNull Part5Question, @NonNull Long> {
}
