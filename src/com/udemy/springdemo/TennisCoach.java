package com.udemy.springdemo;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	private String email;
	
	private String team;
	

	public TennisCoach() {
		System.out.println("TennisCoach: inside no-arg constructor");
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	// setter for the injected dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach: inside fortuneService setter");
		this.fortuneService = fortuneService;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("TennisCoach: inside email setter");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("TennisCoach: inside team setter");
		this.team = team;
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
