package io_programming;

import java.io.File;
import java.io.IOException;

public class FileClassMain {

	public static void main(String[] args) {
		String path1 = "./src/files/";
		String filesPath = "./src/files/greetings.txt";
		String path2 = "./src/";
		String path3 = "./src/hello";

		File f1 = new File(path1);
		File f2 = new File(path2);
		File f3 = new File(path3);
		File f4 = new File(filesPath);
		
		System.out.println(f1.exists()); // true if present else false
		System.out.println(f2.exists()); 
		System.out.println(f3.exists()); 
		System.out.println(f4.exists());
		System.out.println("---------isFile-----------");
		System.out.println(f1.isFile());
		System.out.println(f2.isFile()); 
		System.out.println(f3.isFile()); 
		System.out.println(f4.isFile()); 
		System.out.println("--------isDirectory---------");
		System.out.println(f1.isDirectory());
		System.out.println(f2.isDirectory());
		System.out.println(f3.isDirectory());
		System.out.println(f4.isDirectory());
		System.out.println("--------mkdir created");
		System.out.println(f1.mkdir());
		
		System.out.println("-------createNewFile-----");
		try {
			System.out.println(f1.createNewFile());
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
