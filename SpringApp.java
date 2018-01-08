package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

	public static void main(String[] args) {
		
		
		//load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		//get a bean 
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		
		
		//close the session
		context.close();

	}

}
