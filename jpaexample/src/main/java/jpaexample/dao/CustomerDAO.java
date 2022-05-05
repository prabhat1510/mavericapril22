package jpaexample.dao;

import jpaexample.entities.Customer;

public interface CustomerDAO {
	public void addCustomer(Customer customer);
	public Customer getCustomerById(Integer customerId);
}
