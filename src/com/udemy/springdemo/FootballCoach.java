package com.udemy.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
			
	public FootballCoach(FortuneService aFortuneService) {
		fortuneService = aFortuneService;
	}
	
		
	public FootballCoach() {

	}


	@Override
	public String getDailyWorkout() {
		return "Take penalties 100 times";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
}
