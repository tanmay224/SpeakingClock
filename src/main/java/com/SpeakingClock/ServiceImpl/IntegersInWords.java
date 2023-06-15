package com.SpeakingClock.ServiceImpl;

import java.util.HashMap;
import java.util.Map;



public class IntegersInWords {
	
	 private static final Map<Integer, String> MINUTE_WORDS;
	 
	 static {
		 
		 MINUTE_WORDS = new HashMap<>();
		 MINUTE_WORDS.put(0, "");
	        MINUTE_WORDS.put(1, "one");
	        MINUTE_WORDS.put(2, "two");
	        MINUTE_WORDS.put(3, "three");
	        MINUTE_WORDS.put(4, "four");
	        MINUTE_WORDS.put(5, "five");
	        MINUTE_WORDS.put(6, "six");
	        MINUTE_WORDS.put(7, "seven");
	        MINUTE_WORDS.put(8, "eight");
	        MINUTE_WORDS.put(9, "nine");
	        MINUTE_WORDS.put(10, "ten");
	        MINUTE_WORDS.put(11, "eleven");
	        MINUTE_WORDS.put(12, "twelve");
	        MINUTE_WORDS.put(13, "thirteen");
	        MINUTE_WORDS.put(14, "fourteen");
	        MINUTE_WORDS.put(15, "fifteen");
	        MINUTE_WORDS.put(16, "sixteen");
	        MINUTE_WORDS.put(17, "seventeen");
	        MINUTE_WORDS.put(18, "eighteen");
	        MINUTE_WORDS.put(19, "nineteen");
	        MINUTE_WORDS.put(20, "twenty");
	        MINUTE_WORDS.put(30, "thirty");
	        MINUTE_WORDS.put(40, "forty");
	        MINUTE_WORDS.put(50, "fifty");
	        
	 }
	 
}
