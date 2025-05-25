package Assignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountWordsFile {
	// split method to count space to give total words present in file
	public static void main(String[] args) {
		String path = "./src/Assignment/Files/datafile.txt";
		try (FileReader fin = new FileReader(path); BufferedReader br = new BufferedReader(fin)) {
			String str;
			int count = 0;
			while (true) {
				str = br.readLine();
				if (str == null)
					break;
				String words[] = str.split(" ");
				count += words.length;
//				for (String s : words) {
//						System.out.println(s);
////						count++;
//					}
			}
			System.out.println("Total word present in file is: "+count);
		} catch (Exception e) {

		}

	}

}
