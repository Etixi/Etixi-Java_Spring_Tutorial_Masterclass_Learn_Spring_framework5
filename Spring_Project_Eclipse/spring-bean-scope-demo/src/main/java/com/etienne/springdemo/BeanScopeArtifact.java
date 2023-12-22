package com.etienne.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etienne.springdemo.domain.Organization;

public class BeanScopeArtifact {
	
	public static void main(String[] args) {
		
		// Create the application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// Create the bean
		
		Organization org = (Organization) ctx.getBean("myorg");
		Organization org2 = (Organization) ctx.getBean("myorg");
		org2.setPostalCode("98989");
		
		// invoke the company slogan via the bean
		// System.out.println(org.corporateSlogan());
		
		//Print Organization detail
		System.out.println(org);
		System.out.println(org2);
		if (org == org2) {
			System.out.println("Singleton scope test: org and org2 point to the same instance");
		} else {
			System.out.println("Both org and org2 are separate instances");
		}
		
		// System.out.println(org.corporateService());
		
		// close the application context (container)
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
