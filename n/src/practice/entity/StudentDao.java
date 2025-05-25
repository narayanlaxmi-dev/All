package practice.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class StudentDao implements JDBCDao<Student, Integer> {

	@Override
	public Collection<Student> getAll() {
		Collection<Student> allstudent = new ArrayList<Student>();
		try (Connection dbconnection = AutoLoading.buildConnection();
				Statement smt = dbconnection.createStatement();
				ResultSet rs = smt.executeQuery("select * from student");) {

			// record display navigated
			while (rs.next()) {
				int id = rs.getInt(1);
				String sName = rs.getString(2);
				String Scity = rs.getString(3);
				Student stud = new Student(id, sName, Scity);
				allstudent.add(stud);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return allstudent;
	}

	@Override
	public Student getOne(Integer sid) {
		Student foundstudent = null;
		String sqlQuery = "select * from student where rollno =?";
		try (Connection dbconnection = AutoLoading.buildConnection();
				PreparedStatement presmt = dbconnection.prepareStatement(sqlQuery);

		) {
			presmt.setInt(1, sid);
			ResultSet rs = presmt.executeQuery();
			if (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String city = rs.getString(3);
				foundstudent = new Student(id, name, city);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return foundstudent;
	}

	@Override
	public void add(Student sid) {
		String sqlQuery = "insert into student values(?,?,?);";
		try (Connection dbconnection = AutoLoading.buildConnection();
				PreparedStatement presmt = dbconnection.prepareStatement(sqlQuery);) {

			int id = sid.getId();
			String name = sid.getsName();
			String city = sid.getsCity();

			presmt.setInt(1, id);
			presmt.setString(2, name);
			presmt.setString(3, city);

			int updatecount = presmt.executeUpdate();
			System.out.println(updatecount + " Total Record Added");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(Student sid) {

	}

	@Override
	public void delete(Integer sid) {
		String sqlQuery = "delete form student where rollno = ?";
		try (Connection dbConnection = AutoLoading.buildConnection();
				PreparedStatement psmt = dbConnection.prepareStatement(sqlQuery);) {
			psmt.setInt(1, sid);
			int count = psmt.executeUpdate();
			System.out.println(count + " deleted recod Deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
