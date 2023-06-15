package com.SpeakingClock.TestController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ClockControllerTest {

    @Mock
    private ClockService clockService;

    @InjectMocks
    private ClockController clockController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testConvertTimeToWords() {
        // Input time
        String time = "12:30";

        // Expected result
        String expectedResult = "its twelve thirty";

        // Mock the behavior of the clockService
        when(clockService.convertTimeToWords(time)).thenReturn(expectedResult);

        // Call the API
        ResponseEntity<String> responseEntity = clockController.convertTimeToWords(time);

        // Verify the response
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(expectedResult, responseEntity.getBody());
    }
}
