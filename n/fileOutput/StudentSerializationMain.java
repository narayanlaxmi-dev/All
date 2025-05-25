package Assignment;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// serialization  object to file save permenent save
public class StudentSerializationMain {
	public static void main(String[] args) {
		String filepath = "./src/Assignment/Files/Student_Created.txt";
		try (FileOutputStream fin = new FileOutputStream(filepath);
				ObjectOutputStream oos = new ObjectOutputStream(fin))
		{
			Student s1 = new Student();
			Student s2 = new Student("neyan", 02, 99);
			Student s3 = new Student("narayan", 02, 98);
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.writeObject(s3);
			System.out.println("The student data has been Serialized");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
