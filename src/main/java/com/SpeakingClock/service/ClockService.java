package com.SpeakingClock.service;

import org.springframework.stereotype.Service;

@Service
public interface ClockService {
	public  String convertTimeToWords(String time);
	
}
