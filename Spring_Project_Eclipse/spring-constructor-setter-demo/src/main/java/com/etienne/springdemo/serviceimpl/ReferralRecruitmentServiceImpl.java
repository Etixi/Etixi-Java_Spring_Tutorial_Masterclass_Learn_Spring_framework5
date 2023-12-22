package com.etienne.springdemo.serviceimpl;

import java.util.Random;

import com.etienne.springdemo.service.RecruitmentService;

public class ReferralRecruitmentServiceImpl implements RecruitmentService {

	@Override
	public String recruitEmployees(String companyName, 
									String departmentName, 
									int numberOfRecruitments) {
		
		Random random = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired " + 
							random.nextInt(numberOfRecruitments) + " employess " + 
							" which were referred to the company by employees.";
		return hiringFacts;
	}

}
