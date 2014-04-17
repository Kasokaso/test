package com.kasalica.designPattern.DAO;

import java.util.Collection;

import javax.sql.RowSet;

// Interface that all CustomerDAOs must support
public interface CustomerDAO {

	public int insertCustomer();

	public boolean deleteCustomer();

	public Customer findCustomer();

	public boolean updateCustomer(Customer customer);

	public RowSet selectCustomersRS();

	public Collection selectCustomersTO(Customer customer);

}