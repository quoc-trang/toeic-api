package com.triangle.toeicapi.repository;

import com.triangle.toeicapi.model.ToeicWord;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToeicWordRepository extends JpaRepository<@NonNull ToeicWord, @NonNull Long> {

}
