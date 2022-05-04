package crmjdbcapp.ui;

import crmjdbcapp.service.CustomerService;
import crmjdbcapp.service.CustomerServiceImpl;

public class CRMMainApp {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();

		customerService.getAllCustomer().forEach(System.out::println);

	}

}
