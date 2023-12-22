package com.etienne.springdemo;

public class OrganizationFactory {
	
	public Organization getInstance(String companyName, int yearOfIncorporation) {
		System.out.println("Invoking Factory Method .................");
		return new Organization(companyName, yearOfIncorporation);
	}

}
