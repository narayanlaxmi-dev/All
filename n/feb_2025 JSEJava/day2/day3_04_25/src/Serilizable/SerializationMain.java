package Serilizable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationMain {
	public static void main(String[] args) {
		String filepath = "./src/files/Book_data_created.txt"; // junk file created
		try (FileOutputStream fout = new FileOutputStream(filepath);
				ObjectOutputStream oout = new ObjectOutputStream(fout)) {
			Book currentB1 = new Book("Art of win  fight", 1000);
			oout.writeObject(currentB1);
			System.out.println("booke object searilized");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
