package crmjdbcapp.service;

import java.util.List;

import crmjdbcapp.dao.CustomerDAO;
import crmjdbcapp.dao.CustomerDAOImpl;
import crmjdbcapp.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public List<Customer> getAllCustomer() {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		return customerDAO.getAllCustomer();
	}

}
