package com.kasalica.designPattern.DAO;

import java.util.Collection;

public class Snippet {

	public static void main(String[] args) {
		// create the required DAO Factory
		DAOFactory cloudscapeFactory = DAOFactory
				.getDAOFactory(DAOFactory.DAOCLOUDSCAPE);

		// Create a DAO
		CustomerDAO custDAO = cloudscapeFactory.getCustomerDAO();

		// create a new customer
		int newCustNo = custDAO.insertCustomer();

		// Find a customer object. Get the Transfer Object.
		Customer cust = custDAO.findCustomer();

		// modify the values in the Transfer Object.
		cust.setStreetAddress("Vuka Micunovica 3 ");
		cust.setName("Name");
		// update the customer object using the DAO
		custDAO.updateCustomer(cust);

		// delete a customer object
		custDAO.deleteCustomer();
		// select all customers in the same city
		Customer criteria = new Customer();
		criteria.setCity("New York");
		Collection customersList = custDAO.selectCustomersTO(criteria);

		// returns customersList - collection of Customer
		// Transfer Objects. iterate through this collection to
		// get values.

	}
}
