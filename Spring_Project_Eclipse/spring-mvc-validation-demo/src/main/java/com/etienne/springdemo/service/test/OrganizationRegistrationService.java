package com.etienne.springdemo.service.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OrganizationRegistrationService {
	
	@Value("#{serviceLengthOptions}")
	private Map<String, String> serviceLengthList;
	
	
	public Map<String, String> populateTurnover(){
		Map<String, String> turnover = new LinkedHashMap<String, String>();
		turnover.put("none", "-------SELECT--------");
		turnover.put("none", "less than $1,000");
		turnover.put("none", "Greater than $1,000 but less than $10,000");
		turnover.put("100000", "Greater than $10,000 but less than $100,000");
		return turnover;
	}
	public Map<String, String> populateTypes(){
		Map<String, String> types = new LinkedHashMap<String, String>();
		types.put("gov", "Government");
		types.put("semigov", "Semi Government");
		types.put("private", "Private");
		return types;
	}
	
	public Map<String, String> populateServiceLengths(){
		return new TreeMap<String, String>(serviceLengthList);
	}
	
	public Map<String, String> populateRegisteredPreviously(){
		Map<String, String> registeredPreviously = new LinkedHashMap<String, String>();
		registeredPreviously.put("true", "Yes");
		registeredPreviously.put("false", "No");
		return registeredPreviously;
	}
	public Map<String, String> populateOptionalServices(){
		Map<String, String> optionalServices = new LinkedHashMap<String, String>();
		optionalServices.put("emailService", "Mailing List");
		optionalServices.put("promotionService", "Promotional Emails");
		optionalServices.put("newsLetterService", "Weekly NewsLetter");
		return optionalServices;
	}
	public Map<String, String> populatePremiumServices(){
		Map<String, String> premiumServices = new LinkedHashMap<String, String>();
		premiumServices.put("directoryService", "Directory");
		premiumServices.put("revenueReportService", "Revenue Reports");
		premiumServices.put("revenueAnalyticsService", "Revenue Analytics");
		return premiumServices;
	}
	public Map<String, String> populateEmployeesStrength(){
		Map<String, String> employeesStrength = new LinkedHashMap<String, String>();
		employeesStrength.put("small", "Less than 100");
		employeesStrength.put("meduim", "Greater than or equal to 100 but less than 1000");
		employeesStrength.put("large", "1000 or more");
		return employeesStrength;
	}
}
