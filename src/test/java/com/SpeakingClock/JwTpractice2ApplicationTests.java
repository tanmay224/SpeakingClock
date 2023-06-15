package com.SpeakingClock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;


import com.SpeakingClock.controller.ClockController;

@SpringBootTest
class JwTpractice2ApplicationTests {

   
	@Autowired
    private ClockController clockController;

    @BeforeEach
    void setUp() {
       
       
    }

	@Test
    void testConvertTimeToWords_ValidTime_ReturnsOk() {
        // Input time
        String time = "12:30";

        // Expected result
        String expectedResult = "its twelve thirty";

        // Call the API
        ResponseEntity<String> responseEntity = clockController.convertTimeToWords(time);

        // Verify the response
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(expectedResult, responseEntity.getBody());
    }

    @Test
    void testConvertTimeToWords_InvalidTime_ReturnsBadRequest() {
        // Input time
        String time = "25:00"; // Invalid time

        // Call the API
        ResponseEntity<String> responseEntity = clockController.convertTimeToWords(time);

        // Verify the response
        assertEquals(HttpStatus.BAD_REQUEST, responseEntity.getStatusCode());
    }
}

