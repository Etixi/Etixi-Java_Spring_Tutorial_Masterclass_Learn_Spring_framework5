package com.etienne.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etienne.springdemo.domain.HumanResourceDept;
import com.etienne.springdemo.domain.Organization;

public class DiConstructorApp {
	
	public static void main(String[] args) {
		
		// Create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// Create the bean
		
		Organization org = (Organization) ctx.getBean("myorg");
		
		// invoke the company slogan via the bean
		System.out.println(org.corporateSlogan());
		
		//Print Organization detail
//		System.out.println(org);
//		
//		System.out.println(org.corporateService());
		
		HumanResourceDept hrdept = (HumanResourceDept) ctx.getBean("myhrdept");
		System.out.println(hrdept.hiringStatus(5500));
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
