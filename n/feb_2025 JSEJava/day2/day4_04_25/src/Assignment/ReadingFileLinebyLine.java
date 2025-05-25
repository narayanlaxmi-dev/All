package Assignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingFileLinebyLine {
//write java program that reads a text file line by line Bufferreader Filereader
	public static void main(String[] args) {
		String path = "./src/Assignment/Files/datafile.txt";

		try (FileReader fin = new FileReader(path); BufferedReader br = new BufferedReader(fin)) {
			System.out.println("File is found..");
			String str;
			while (true) {
				str = br.readLine();
				if (str == null)
					break;
				System.out.println(str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
