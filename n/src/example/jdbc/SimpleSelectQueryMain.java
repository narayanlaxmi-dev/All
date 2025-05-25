package example.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

//import com.mysql.cj.jdbc.Driver;

public class SimpleSelectQueryMain {

	public static void main(String[] args) {
		// 1 load the driver
//		every JDBC driver is a driver implementation class
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		// reflection forname method
		try {
			Class.forName(driverClassName);
			System.out.println("Driver loaded...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2 establish connection to DB
//		 this done basis of 3 properties Connection URL, UserName, Password
		String connectionURL ="jdbc:mysql://localhost:3306/cdac";
		String userName ="root";
		String password ="password";
		try {
			DriverManager.getConnection(connectionURL, userName, password);
			System.out.println("Connection Established...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		Obtain some Statment PreparedStatment CallableStatment
	}

}
