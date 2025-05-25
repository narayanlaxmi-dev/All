package practice.entity;

import java.sql.Connection;
import java.sql.DriverManager;

public class AutoLoading {

	// method load buildconnection
	public static Connection buildConnection() throws Exception {
		String connectionURL = "jdbc:mysql://localhost:3306/cdac";
		String userName = "root";
		String password = "password";
		Connection dbConnection = DriverManager.getConnection(connectionURL, userName, password);
		System.out.println("Loaded Connection...");
		return dbConnection;

	}

}
