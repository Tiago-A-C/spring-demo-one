package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		TennisCoach tennisCoach = context.getBean("myTennisCoach", TennisCoach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		
		// call literal value methods
		System.out.println(tennisCoach.getEmail());
		System.out.println(tennisCoach.getTeam());

		
		context.close();

	}

}
