package crmjdbcapp.dao;

import java.util.List;

import crmjdbcapp.model.Customer;

public interface CustomerDAO {

	public List<Customer> getAllCustomer();
	public Customer getCustomerById(Integer custid);
	public String deleteCustomer(Integer custId);
	public Integer addCustomer(Customer customer);
}
