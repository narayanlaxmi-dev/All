package example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleSelectQueryMain2 {

	public static void main(String[] args) {
		// STEP 1 load the driver
//		every JDBC driver is a driver implementation class
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		int n = 0;
		Connection dbConnection = null;
		Statement statment = null;
		ResultSet resultset = null;

		try {
			// reflection forname method
//			will load the class static block is called and executed registered communication b/w drivermanager
			Class.forName(driverClassName);
			System.out.println("Driver loaded...");

			// STEP 2 establish connection to DB
//		    this done basis of 3 properties Connection URL, UserName, Password
			String connectionURL = "jdbc:mysql://localhost:3306/cdac";
			String userName = "root";
			String password = "password";

			dbConnection = DriverManager.getConnection(connectionURL, userName, password);
			System.out.println("Connection Established...");

//			STEP3 Obtain some Statement PreparedStatment CallableStatment
//			in this case statment bec query is SIMPLE query
			statment = dbConnection.createStatement();

//			STEP 4 Execute query, this case(SELECT) need to obtain resultSet bec SELECT query set of records that why use reseltset
			String sqlQuery = "select empno,ename,sal from emp";
			resultset = statment.executeQuery(sqlQuery);

//			STEP 5 perform navigation
			System.out.println("\n--- ResultSet Print ---");
			while (resultset.next()) {
				int empNo = resultset.getInt(1);
				String empName = resultset.getString(2);
				float empSal = resultset.getFloat(3);
				System.out.println(++n + "\t" + empNo + " \t" + empName + " \t" + empSal);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				resultset.close();
				statment.close();
				dbConnection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

}
