package oops1;
import java.util.*;
public class Students {
		private int rollno;
		private String name;
		private float marks;
	
		Scanner sc = new Scanner(System.in);
		
	public void set_data() {
//		this.name = name; // same name as formal parameter and member variable so use this.
//		this.rollno = rollno;
//		this.marks = marks;
		System.out.println("Enter rollno, name , marks");
		rollno = sc.nextInt();
		name = sc.next();
		marks = sc.nextFloat();
		
	}
	
	float compare() {
		return (marks);
	}
	
	void get_data() {
		System.out.println("The std name is :" + name);
		System.out.println("The std ID is :" + rollno);
		System.out.println("The std marks is :" + marks);
	}
}
