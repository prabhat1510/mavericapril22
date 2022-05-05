package jpaexample.service;

import jpaexample.dao.CustomerDAO;
import jpaexample.dao.CustomerDAOImpl;
import jpaexample.entities.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO customerDao= new CustomerDAOImpl();
	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	@Override
	public Customer getCustomerById(Integer customerId) {
		return customerDao.getCustomerById(customerId);
	}

}
