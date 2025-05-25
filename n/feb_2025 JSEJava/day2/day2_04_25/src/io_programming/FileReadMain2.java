package io_programming;

// make used of try-with-resources so that it gets closed automatically..
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadMain2 {

	public static void main(String[] args) {
		String filePath = "./src/files/greetings.txt";

//		try-with-resources
		// no need to used finally block if try(){}
		try (FileInputStream fin = new FileInputStream(filePath)) { // resource is open or created
			System.out.println("FILE found....");
			while (true) {
				// read() read 1 char at a time 
				int data = fin.read();
				if (data == -1)
					break;
//				System.out.print(data); // no need to ln for single char
				char ch = (char) data;
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}