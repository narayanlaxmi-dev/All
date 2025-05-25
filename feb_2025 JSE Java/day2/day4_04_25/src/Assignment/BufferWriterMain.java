package Assignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferWriterMain {

	public static void main(String[] args) {
		String path = "./src/Assignment/Files/writefile.txt";
		try (FileWriter wr = new FileWriter(path); BufferedWriter bw = new BufferedWriter(wr)) {
			System.out.println("Enter the data to write file\n (exit) to stop");
			Scanner sc = new Scanner(System.in);
			String output;
			while (true) {
				output = sc.nextLine();
				if (output.contains("exit"))
					break;
				bw.write(output);
				bw.newLine();
			}
			sc.close();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
