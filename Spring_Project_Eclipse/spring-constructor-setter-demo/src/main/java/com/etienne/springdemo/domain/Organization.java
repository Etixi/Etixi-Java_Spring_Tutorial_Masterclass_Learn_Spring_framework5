package com.etienne.springdemo.domain;

import com.etienne.springdemo.service.BusinessService;

public class Organization {
	
	private String companyName;
	private int yearOfIncorporation;
	private String postalCode;
	private int employeeCount;
	private String slogan;
	private BusinessService businessService; //= new CloudServiceImpl();
	
	
//	public Organization() {
//		
//	}
	
	public Organization(String companyName, int yearOfIncorporation) {
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}
	
	
	
	public String getCompanyName() {
		return companyName;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}


	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}


	public String corporateSlogan() {
		return slogan;
	}

	public String corporateService() {
		return businessService.offerService(companyName);
	}
	
	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + "]";
	}
}
