package io_programming;

import java.io.FileOutputStream;
import java.util.Scanner;

public class FileWriteMain {

	public static void main(String[] args) {
		String filePath = "./src/files/writeMovies.txt";

//		Scanner sc = new Scanner(System.in);
		String movieInfo = """
				List of Movie Available:
				1 KGF
				2 speed
				3 salar
				4 ONEPIECE
				Adding new movies:
					5 gladitor
					6 baki""";

	

		// adding second paramet is true in object 
		try (FileOutputStream fot = new FileOutputStream(filePath, true)) { // if file create but not write for some permision
																		// so used catch
			byte[] movieData = movieInfo.getBytes();
			fot.write(movieData);// right click project refresh file is present
			System.out.println("Data has been written to file...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
