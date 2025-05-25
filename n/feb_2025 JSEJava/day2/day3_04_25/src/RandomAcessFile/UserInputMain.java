package RandomAcessFile;

import java.io.InputStream;
import java.util.Scanner;

public class UserInputMain {
	public static void main(String[] args) {

		InputStream keyboard = System.in;

		try (Scanner scr = new Scanner(keyboard)) {
			System.out.println("Enter Book Title");
			String title = scr.nextLine();
			System.out.println("Enter Price book (INR)");
			int price = scr.nextInt();
			System.out.println("Without OBject : "+title + "+ " + price);
			Book currentbk = new Book(title, price); // 1 obj store 1 book details title and price
			System.out.println("OBject : "+currentbk);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
