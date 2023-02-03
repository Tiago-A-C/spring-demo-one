package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		// call workout method on bean
		System.out.println(coach.getDailyWorkout());
		
		// call fortune method on bean
		System.out.println(coach.getDailyFortune());
		
		// close context
		context.close();
	
	}
}
