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

	@Override
	public Customer getCustomerById(Integer custid) {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		return customerDAO.getCustomerById(custid);
	}

	@Override
	public String deleteCustomer(Integer custId) {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		return customerDAO.deleteCustomer(custId);
	}

	@Override
	public Integer addCustomer(Customer customer) {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		return customerDAO.addCustomer(customer);
	}

}
