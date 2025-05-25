package example.jdbc;

import java.util.Collection;
import java.util.Scanner;

public class SimpleSelectQueryMain3CRUD {
	private static void showAllDepartments() {
		JdbcDao<Department, Integer> dao = new DepartmentDao();
		Collection<Department> deptlist = dao.getAll();
//		for(Department dept : deptlist) 
//			System.out.println(dept);

		// stream api
		deptlist.stream().forEach(dept -> System.out.println(dept));
	}

	private static void showOneDepartment(int deptno) {
		JdbcDao<Department, Integer> dao = new DepartmentDao();
		Department dept = dao.getOne(deptno); // 10 hardcoded value
		if (dept != null)
			System.out.println(dept);
		else
			System.err.println("Dept with given id not exist..");
	}

	
	private static void addNewDepartment() {
		JdbcDao<Department, Integer> dao = new DepartmentDao();
		Department dept = new Department(50, "narayan", "nashik");
		dao.add(dept);
		
	}
	public static void main(String[] args) {

		System.out.println("\nGet all Department");
		showAllDepartments();
//		---------------------------------------------------------------------
		System.out.println("\nget 1 record....");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check particular department: ");
		int num = sc.nextInt();
		showOneDepartment(num);
		sc.close();
//		---------------------------------------------------------------------
//		addNewDepartment();
	}

}
