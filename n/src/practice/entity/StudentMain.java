package practice.entity;

import java.util.Collection;
import java.util.Scanner;

public class StudentMain {
	public static void showAllStudent() {
		JDBCDao<Student, Integer> dao = new StudentDao();
		Collection<Student> stdList = dao.getAll();
		for (Student std : stdList) {
			System.out.println(std);
		}
	}

	public static void showOneStudent(int stud) {
		JDBCDao<Student, Integer> dao = new StudentDao();
		Student student = dao.getOne(stud);
		if (student != null)
			System.out.println(student);
		else
			System.err.println("Not found student for this id: " + stud);
	}

	public static void addStudent(int id, String name, String city) {
		JDBCDao<Student, Integer> dao = new StudentDao();
		Student student = new Student(id, name, city);
		dao.add(student);
		System.out.println("successfully added...");
	}

	public static void removeStudent(Integer id) {
		JDBCDao<Student, Integer> dao = new StudentDao();
		dao.delete(id);
		System.out.println("successfully added...");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean exit = true;

		while (exit) {
			System.out.println("--- MENU ---\n" + "0 : exit\n" + "1 : add student\n" + "2 : dispaly all sudent\n"
					+ "3 : get specific student\n" + "Enter choice.");
			int ch = sc.nextInt();
			switch (ch) {
			case 0:
				System.out.println("Thankyou to using me");
				exit = false;
				break;
			case 1:
				System.out.println(" --- add students ---");
				System.out.println("Enter id, name, city");
				addStudent(sc.nextInt(), sc.next(), sc.next());
				break;

			case 2:
				System.out.println(" --- show All students ---");
				showAllStudent();
				break;

			case 3:
				System.out.println(" --- show one students ---");
				System.out.println("Enter id to get specific student details: ");
				showOneStudent(sc.nextInt());
				break;
			case 4:
				System.out.println(" --- remove students ---");
				System.out.println("Enter id to get specific student to delete: ");
				removeStudent(sc.nextInt());
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}

	}

}
