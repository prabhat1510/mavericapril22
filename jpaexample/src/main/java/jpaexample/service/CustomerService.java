package jpaexample.service;

import jpaexample.entities.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);
	public Customer getCustomerById(Integer customerId);
}
