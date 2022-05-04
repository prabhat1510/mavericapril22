package crmjdbcapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import crmjdbcapp.model.Address;
import crmjdbcapp.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Write the logic to retrieve the all customer records or data from MySQL RDBMS
		//JDBC - Java Database Connection API
			Customer customer;
			List<Customer> customerList = new ArrayList<Customer>();
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/maveric22", "root", "password");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from customer");
			while(rs.next()) {
				customer = new Customer();
				populateCustomer(customer,rs);
				customerList.add(customer);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customerList;
	}
	
	private void populateCustomer(Customer customer, ResultSet rs) throws SQLException {
			customer.setCustId(rs.getInt("custid"));
			customer.setCustName(rs.getString("custname"));
			customer.setEmail(rs.getString("email"));
			customer.setMobile(rs.getLong("mobile"));
			Address address = new Address();
			address.setAddressId(rs.getInt("addressid"));
			address.setCity(rs.getString("city"));
			address.setState(rs.getString("state"));
			address.setFloorNo(rs.getInt("floorNo"));
			address.setArea(rs.getString("area"));
			address.setPinCode(rs.getLong("pincode"));
			address.setCountry(rs.getString("country"));
			customer.setAddress(address);
	}

}
