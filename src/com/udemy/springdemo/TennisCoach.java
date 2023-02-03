package com.udemy.springdemo;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
		
	public TennisCoach() {
		System.out.println("TennisCoach: inside no-arg constructor");
	}
	
	// setter for the injected dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach: inside fortuneService TennisCoach setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice aces for 2h";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
