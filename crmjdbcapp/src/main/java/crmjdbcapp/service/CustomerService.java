package crmjdbcapp.service;

import java.util.List;

import crmjdbcapp.model.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomer();
	public Customer getCustomerById(Integer custid);
	public String deleteCustomer(Integer custId);
	public Integer addCustomer(Customer customer);
}
