package com.etienne.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etienne.springdemo.domain.Organization;
import com.etienne.springdemo.domain.promotion.TradeFair;

public class ComponentAnnotationApp {
	
	public static void main(String[] args) {
		
		// Create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		TradeFair tradeFair = (TradeFair) ctx.getBean("myfair");
		System.out.println(tradeFair.specialPromotionPricing());
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
