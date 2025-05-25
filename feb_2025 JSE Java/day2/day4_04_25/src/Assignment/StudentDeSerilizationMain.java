package Assignment;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StudentDeSerilizationMain {

	public static void main(String[] args) {
		String filepath = "./src/Assignment/Files/Student_Created.txt";
		try (FileInputStream fin = new FileInputStream(filepath); 
				ObjectInputStream oos = new ObjectInputStream(fin))
		{
			Object obj = oos.readObject();
			System.out.println("\nStudent file  readed\n" + obj);
			System.out.println("\n-------print specific values --------");
			Student stdobj = (Student) obj;
			System.out.println(stdobj.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
