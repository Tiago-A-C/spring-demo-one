package com.udemy.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
		
	public TrackCoach(FortuneService aFortuneService) {
		fortuneService = aFortuneService;
	}
		
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
