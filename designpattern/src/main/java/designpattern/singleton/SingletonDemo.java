package designpattern.singleton;

import java.sql.Connection;
import java.sql.SQLException;

public class SingletonDemo {

	public static void main(String[] args) {
		
		//Singleton Example
		SingletonClass singletonClass = SingletonClass.getInstance();
		SingletonClass singletonClassA = SingletonClass.getInstance();
		System.out.println(singletonClass == singletonClassA);
		
		
		//Usage of Singleton 
		DBConnection dbConnection = DBConnection.getInstance();
		try {
			Connection connection =dbConnection.getConnection();
			connection.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
