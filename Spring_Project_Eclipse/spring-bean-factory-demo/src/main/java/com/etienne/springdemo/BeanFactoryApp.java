package com.etienne.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryApp {
	
	public static void main(String[] args) {
		// Create the application context (container)
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// Create the bean
		
		Organization org = (Organization) ctx.getBean("myorg");
		Organization org2 = (Organization) ctx.getBean("myorg2");
		// invoke the company slogan via the bean
		//org.corporateSlogan();
		
		//Print Organization detail
		System.out.println(org);
		System.out.println(org2);
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
