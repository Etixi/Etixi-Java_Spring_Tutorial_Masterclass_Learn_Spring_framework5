package com.etienne.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppChallenge1 {
	
	public static void main(String[] args) {
		// Create the application context (container)
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-challenge.xml");
		
		// Create the bean
		
		City city = (City) ctx.getBean("mycity");
		
		// invoke the city name method
		city.cityName();
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
