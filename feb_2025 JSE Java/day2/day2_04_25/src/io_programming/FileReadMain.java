package io_programming;

// reading file
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		// right click project properties path
		// ABSOLUTE PATH
//		String filePath = "C:/Users/cdac/Documents/feb_2025 oops Java/day2/day1_04_25/files/greetings.txt";
		// RELATIVE PATH used if file inside project
		/*
		 * BOF begning of file start fin curson 
		 * EOF ending of file
		 */
		String filePath = "./src/files/greetings.txt";
		// heap store harddisk=secondary storage
		FileInputStream fin = null;
		try {
			
			fin = new FileInputStream(filePath);
			System.out.println("FILE found....");
			while (true) {
				int data = fin.read(); // read() one char at a time A=65 a=97 // resource is used[object created]
				if (data == -1)
					break;
//				System.out.print(data); // no need to ln for single char
				char ch = (char) data;
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {// read() method error so used IOException
			e.printStackTrace();
		}
		// in finally block i close din object
		finally {
			System.out.println("file closed....");
			try {
				fin.close(); // resource is closed [object is destroyed] GC handled.......
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				System.out.println("END.................");
			}
		}
	}

}
