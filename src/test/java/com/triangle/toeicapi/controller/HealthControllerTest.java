package com.triangle.toeicapi.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthControllerTest {

    @Test
    void health_shouldReturnExpectedMessage(){
        HealthController controller = new HealthController();

        String result = controller.health();

        assertEquals("Toeic API is running ✅", result);
    }

}
