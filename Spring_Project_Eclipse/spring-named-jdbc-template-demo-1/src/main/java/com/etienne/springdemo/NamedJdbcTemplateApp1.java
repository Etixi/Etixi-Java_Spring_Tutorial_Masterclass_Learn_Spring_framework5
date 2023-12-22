package com.etienne.springdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.etienne.springdemo.dao.OrganizationDao;
import com.etienne.springdemo.daoimpl.OrganizationDaoImpl;
import com.etienne.springdemo.domain.Organization;


@Component
public class NamedJdbcTemplateApp1 {

	@Autowired
	private OrganizationDao dao;

	@Autowired
	private DaoUtils daoUtils;

	public void actionMethod() {

		// Creating seed data
		daoUtils.createSeedData(dao);

		// List organizations
		List<Organization> orgs = dao.getAllOrganizations();
		daoUtils.printOrganization(orgs, daoUtils.readOperation);

		// Create a new organization record
		Organization org = new Organization("General Electric", 1978, "98989", 5776, "Imagination at work");
		boolean isCreated = dao.create(org);
		daoUtils.printSuccessFailure(daoUtils.createOperation, isCreated);
		daoUtils.printOrganization(dao.getAllOrganizations(), daoUtils.readOperation);


		// get a single organization
		Organization org2 = dao.getOrganization(1);
		daoUtils.printOrganization(org2, "getOrganization");

		// Updating a slogan for an organization 
		Organization org3 = dao.getOrganization(2);
		org3.setSlogan("We buil ** awesome ** driving machines!");
		boolean isUpdated = dao.update(org3);
		daoUtils.printSuccessFailure(daoUtils.updateOperation, isUpdated);
		daoUtils.printOrganization(dao.getOrganization(2), daoUtils.updateOperation);

		// Delete an organizations
		boolean isDeleted = dao.delete(dao.getOrganization(3));
		daoUtils.printSuccessFailure(daoUtils.deleteOperation, isDeleted);
		daoUtils.printOrganization(dao.getAllOrganizations(), daoUtils.deleteOperation);

		// Cleanup
		//dao.cleanup();
		daoUtils.printOrganizationCount(dao.getAllOrganizations(), daoUtils.cleanupOperation);
	}

	public static void main(String[] args) {

		// Creating the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		NamedJdbcTemplateApp1 mainApp = ctx.getBean(NamedJdbcTemplateApp1.class);
		mainApp.actionMethod();

		// create the bean
		//OrganizationDao dao = (OrganizationDaoImpl) ctx.getBean("orgDao");


		// close the application context
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
