package example.jdbc;
// this is utility class used ofr obtaining a connection

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtils {

	public static Connection buildConnection() throws Exception {
		// Class.forName is not required bec the driver get loaded automatically once is
		// jar file fond in build path
		String connectionURL = "jdbc:mysql://localhost:3306/cdac";
		String userName = "root";
		String password = "password";
		Connection dbConnection = DriverManager.getConnection(connectionURL, userName, password);
		System.out.println("Got Connection Established...");
		return dbConnection;
	}

}
