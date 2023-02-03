package com.udemy.springdemo;

public class BaseballCoach implements Coach{

	// field for dependency
	private FortuneService fortuneService;
	
	// dependency injection constructor
	public BaseballCoach(FortuneService aFortuneService) {
		fortuneService = aFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30min on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
