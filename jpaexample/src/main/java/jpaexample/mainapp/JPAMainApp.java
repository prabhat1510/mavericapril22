package jpaexample.mainapp;

import jpaexample.entities.Customer;
import jpaexample.service.CustomerService;
import jpaexample.service.CustomerServiceImpl;

public class JPAMainApp {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		
		Customer customer = new Customer();
		customer.setCustomerId(2);
		customer.setCustomerName("Mahesh Babu");
		
		customerService.addCustomer(customer);
		
		System.out.println(customerService.getCustomerById(1));

	}

}
