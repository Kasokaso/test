package com.kasalica.designPattern.DAO;

// Cloudscape concrete DAO Factory implementation
import java.sql.Connection;

public class CloudscapeDAOFactory extends DAOFactory {

	public static final String DRIVER = "COM.cloudscape.core.RmiJdbcDriver";
	public static final String DBURL = "jdbc:cloudscape:rmi://localhost:1099/CoreJ2EEDB";

	// method to create Cloudscape connections
	public static Connection createConnection() {
		return null;
		// Use DRIVER and DBURL to create a connection
		// Recommend connection pool implementation/usage
	}

	@Override
	public CustomerDAO getCustomerDAO() {
		// CloudscapeCustomerDAO implements CustomerDAO
		return new CloudscapeCustomerDAO();
	}

	@Override
	public AccountDAO getAccountDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDAO getOrderDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}