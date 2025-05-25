
package io_programming;

import java.io.BufferedInputStream;
//bufferinputstream filterinputstream  fileinputstream
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadMain4 {

	public static void main(String[] args) {
		String filePath = "./src/files/greetings.txt";
		
		try (FileInputStream fin = new FileInputStream(filePath);
				BufferedInputStream bin = new BufferedInputStream(fin)) { // performance time speedely
			System.out.println("FILE found....");
			while (true) {
				// read() read 1 char at a time
				int data = bin.read();
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

