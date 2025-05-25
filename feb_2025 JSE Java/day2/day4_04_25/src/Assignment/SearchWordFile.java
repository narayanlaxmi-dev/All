package Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SearchWordFile {
// to find a word we have contains method str.contains("hello");
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to found:");
		String userWord = sc.next();
		sc.close();

		String path = "./src/Assignment/Files/datafile.txt";

		try (FileReader fin = new FileReader(path); BufferedReader br = new BufferedReader(fin)) {
			String str;
			int lineno = 0;
			boolean isFound = false;

			while (true) {

				str = br.readLine();
				if (str == null)
					break;
				System.out.println(str);
				lineno++;
				if (str.contains(userWord.toLowerCase())) { // because i remove all capital in txt file
					isFound = true;
					break;
				}
			}
			if (isFound) {
				System.out.println("--------------\nthe line number is " + lineno);
				System.out.println("Word is found");
			}

			else
				System.out.println("--------------\nNOT found");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
