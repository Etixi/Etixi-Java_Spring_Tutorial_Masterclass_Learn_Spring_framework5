package com.etienne.springdemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etienne.springdemo.dao.OrganizationDao;
import com.etienne.springdemo.daoimpl.OrganizationDaoImpl;
import com.etienne.springdemo.domain.Organization;

public class JdbcTemplateClassicApp2 {

	public static void main(String[] args) {
		
		// Creating the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		// create the bean
		OrganizationDao dao = (OrganizationDaoImpl) ctx.getBean("orgDao");
		
		// Creating seed data
		DaoUtils.createSeedData(dao);
		
		// List organizations
		List<Organization> orgs = dao.getAllOrganizations();
		DaoUtils.printOrganization(orgs, DaoUtils.readOperation);
		
		// Create a new organization record
		Organization org = new Organization("General Electric", 1978, "98989", 5776, "Imagination at work");
		boolean isCreated = dao.create(org);
		DaoUtils.printSuccessFailure(DaoUtils.createOperation, isCreated);
		DaoUtils.printOrganization(dao.getAllOrganizations(), DaoUtils.readOperation);
		
		
		// get a single organization
		Organization org2 = dao.getOrganization(1);
		DaoUtils.printOrganization(org2, "getOrganization");
		
		// Updating a slogan for an organization 
		Organization org3 = dao.getOrganization(2);
		org3.setSlogan("We buil ** awesome ** driving machines!");
		boolean isUpdated = dao.update(org3);
		DaoUtils.printSuccessFailure(DaoUtils.updateOperation, isUpdated);
		DaoUtils.printOrganization(dao.getOrganization(2), DaoUtils.updateOperation);
		
		// Delete an organizations
		boolean isDeleted = dao.delete(dao.getOrganization(3));
		DaoUtils.printSuccessFailure(DaoUtils.deleteOperation, isDeleted);
		DaoUtils.printOrganization(dao.getAllOrganizations(), DaoUtils.deleteOperation);
		
		// Cleanup
		dao.cleanup();
		DaoUtils.printOrganizationCount(dao.getAllOrganizations(), DaoUtils.cleanupOperation);
		
		// close the application context
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
