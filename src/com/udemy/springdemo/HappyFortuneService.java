package com.udemy.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] fortuneArray = {
		"Today is your lucky day!",
		"Just do it!",
		"Take a cookie!"
	};
	
	
	@Override
	public String getFortune() {
		Random randomNumber = new Random();

		return fortuneArray[randomNumber.nextInt(fortuneArray.length)];
	}

}
