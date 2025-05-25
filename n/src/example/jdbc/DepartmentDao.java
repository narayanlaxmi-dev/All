package example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class DepartmentDao implements JdbcDao<Department, Integer> {// wrapper class keys

	@Override
	public Collection<Department> getAll() {
		Collection<Department> alldept = new ArrayList<>();

//		try-with-reource autoclosable open under this->()
		try (Connection dbconnection = JDBCUtils.buildConnection();
				Statement smt = dbconnection.createStatement();
				ResultSet rs = smt.executeQuery("select * from dept")) {
//			all record for loop
			while (rs.next()) {
				int deptNo = rs.getInt(1);
				String dName = rs.getString(2);
				String loc = rs.getString(3);
				Department dept = new Department(deptNo, dName, loc);
				alldept.add(dept);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return alldept;
	}

	@Override
	public Department getOne(Integer deptno) {
		Department foundDeptment = null;
//		? indicate unkonwn parameter
		String sqlQuery = "select * from dept where deptno = ?";
//		String sqlQuery = "select * from dept where deptno in (?,?,?)";

		try (Connection dbconnection = JDBCUtils.buildConnection();
				PreparedStatement pstmt = dbconnection.prepareStatement(sqlQuery);) {
			pstmt.setInt(1, deptno); // first ? is index 1
			ResultSet rs = pstmt.executeQuery();
//			one record for if
			if (rs.next()) {
				int deptId = rs.getInt(1);
				String dName = rs.getString(2);
				String loc = rs.getString(3);
				foundDeptment = new Department(deptId, dName, loc);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return foundDeptment;
	}

	@Override
	public void add(Department dept) {
		String sqlQuery = "INSERT INTO DEPT VALUES(?,?,?)";
		try (Connection dbconnection = JDBCUtils.buildConnection();
				PreparedStatement pstmt = dbconnection.prepareStatement(sqlQuery)) {

//			get data 3 values of ?
			int deptNo = dept.getDeptNo();
			String dName = dept.getdName();
			String loc = dept.getLoc();

			pstmt.setInt(1, deptNo);
			pstmt.setString(2, dName);
			pstmt.setString(3, loc);

			int updateCount = pstmt.executeUpdate();
			System.out.println("The UpdateCount: " + updateCount + " record Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Department dept) {

	}

	@Override
	public void delete(Department dept) {

	}

}
