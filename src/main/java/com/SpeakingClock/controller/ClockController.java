package com.SpeakingClock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpeakingClock.service.ClockService;

@RestController
@RequestMapping
public class ClockController {

    @Autowired
    private ClockService clockService;

    @GetMapping("/{time}")
    public ResponseEntity<String> convertTimeToWords(@PathVariable String time) {
        String result;
        try {
            result = clockService.convertTimeToWords(time);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            throw e; 
        }
    }
}


