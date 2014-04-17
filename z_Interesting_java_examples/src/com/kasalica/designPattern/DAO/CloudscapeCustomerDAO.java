package com.kasalica.designPattern.DAO;

// CloudscapeCustomerDAO implementation of the 
// CustomerDAO interface. This class can contain all
// Cloudscape specific code and SQL statements. 
// The client is thus shielded from knowing 
// these implementation details.

import java.util.Collection;

import javax.sql.RowSet;

public class CloudscapeCustomerDAO implements CustomerDAO {

	public CloudscapeCustomerDAO() {
		// initialization
	}

	// The following methods can use
	// CloudscapeDAOFactory.createConnection()
	// to get a connection as required

	@Override
	public int insertCustomer() {
		return 0;
		// Implement insert customer here.
		// Return newly created customer number
		// or a -1 on error
	}

	@Override
	public boolean deleteCustomer() {
		return false;
		// Implement delete customer here
		// Return true on success, false on failure
	}

	@Override
	public Customer findCustomer() {
		return null;
		// Implement find a customer here using supplied
		// argument values as search criteria
		// Return a Transfer Object if found,
		// return null on error or if not found
	}

	@Override
	public boolean updateCustomer(Customer c) {
		return false;
		// implement update record here using data
		// from the customerData Transfer Object
		// Return true on success, false on failure or
		// error
	}

	@Override
	public RowSet selectCustomersRS() {
		return null;
		// implement search customers here using the
		// supplied criteria.
		// Return a RowSet.
	}

	@Override
	public Collection selectCustomersTO(Customer c) {
		return null;
		// implement search customers here using the
		// supplied criteria.
		// Alternatively, implement to return a Collection
		// of Transfer Objects.
	}

}