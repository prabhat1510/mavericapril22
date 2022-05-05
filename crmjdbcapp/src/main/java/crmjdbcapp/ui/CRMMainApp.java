package crmjdbcapp.ui;

import crmjdbcapp.model.Address;
import crmjdbcapp.model.Customer;
import crmjdbcapp.service.CustomerService;
import crmjdbcapp.service.CustomerServiceImpl;

public class CRMMainApp {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();

		customerService.getAllCustomer().forEach(System.out::println);

		System.out.println("***************************************");
		System.out.println(customerService.getCustomerById(2));
		System.out.println("*****************Delete **********************");
		System.out.println(customerService.deleteCustomer(2));
		System.out.println("**********Add Customer****************************");
		Customer cust = new Customer(2,"Murali","murali@gmail.com",9899897910L,new Address(2,null,null,null,null,null,null));
		System.out.println(customerService.addCustomer(cust));
	}

}
