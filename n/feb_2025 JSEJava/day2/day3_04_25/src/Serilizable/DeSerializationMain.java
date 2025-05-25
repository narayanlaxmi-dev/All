package Serilizable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationMain {
	public static void main(String[] args) {
		String filepath = "./src/files/Book_data_created.txt"; // junk file created
		try (FileInputStream fout = new FileInputStream(filepath);
				ObjectInputStream oin = new ObjectInputStream(fout)) {

			Object obj = oin.readObject();
			System.out.println("\nbook_data_created.txt readed\n" + obj);
			System.out.println("\n-------print specific values --------");
			Book bookobj = (Book) obj;
			System.out.println(bookobj.getTitle());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
