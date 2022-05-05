package crmjdbcapp.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.Query;

import crmjdbcapp.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Write the logic to retrieve the all customer records or data from MySQL
		// RDBMS
		// JDBC - Java Database Connection API
		Customer customer;
		List<Customer> customerList = new ArrayList<Customer>();
		try {
			/**
			 * Using DriverManager.getConnection() we are getting connection object
			 */
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/maveric22", "root",
					"password");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(QueryMapper.GET_ALL_CUSTOMERS);
			while (rs.next()) {
				customer = new Customer();
				populateCustomer(customer, rs);
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
		/**
		 * Address address = new Address();
		 * address.setAddressId(rs.getInt("addressid"));
		 * 
		 * address.setCity(rs.getString("city"));
		 * address.setState(rs.getString("state"));
		 * address.setFloorNo(rs.getInt("floorNo"));
		 * address.setArea(rs.getString("area"));
		 * address.setPinCode(rs.getLong("pincode"));
		 * address.setCountry(rs.getString("country")); customer.setAddress(address);
		 **/
	}

	public Customer getCustomerById(Integer custid) {
		Customer customer = new Customer();
		// Connection object
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/maveric22", "root", "password");

			// create or prepare statement
			// select * from customer where custid=2;
			// "select * from customer where custid=? and custName=?; "
			PreparedStatement prepareStmt = conn.prepareStatement(QueryMapper.GET_CUSTOMER_BY_ID);
			prepareStmt.setInt(1, custid);
			// prepareStmt.setString(2, "Saiiii");

			// Exceute the statement
			ResultSet rs = prepareStmt.executeQuery();
			// get data from result set
			while (rs.next()) {
				customer.setCustId(rs.getInt("custid"));
				customer.setCustName(rs.getString("custname"));
				customer.setEmail(rs.getString("email"));
				customer.setMobile(rs.getLong("mobile"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}

	@Override
	public String deleteCustomer(Integer custId) {
		// Connection object
		Connection conn;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/maveric22", "root", "password");
			PreparedStatement prepareStmt = conn.prepareStatement(QueryMapper.DELETE_CUSTOMER);
			prepareStmt.setInt(1, custId);
			int deletedRowCount = prepareStmt.executeUpdate();//this will return the row count deleted
			//prepareStmt.execute()
			if(deletedRowCount == 0 ) {
				return "Unable to delete customer";
			}
				
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Customer deleted successfully";
		
	}

	@Override
	public Integer addCustomer(Customer customer) {
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/maveric22", "root", "password");
			CallableStatement callStmt = conn.prepareCall(QueryMapper.ADD_CUSTOMER);
			//parameters
			callStmt.setInt(1,customer.getCustId());
			callStmt.setString(2, customer.getCustName());
			callStmt.setString(3, customer.getEmail());
			callStmt.setLong(4, customer.getMobile());
			callStmt.setInt(5, customer.getAddress().getAddressId());
			
			int n = callStmt.executeUpdate();
			return n;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
