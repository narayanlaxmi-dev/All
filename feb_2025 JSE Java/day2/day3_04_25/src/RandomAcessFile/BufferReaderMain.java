package RandomAcessFile;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderMain {

	public static void main(String[] args) {
		String filepath = "./src/files/books.txt";
		try (
				FileReader red = new FileReader(filepath); 
				BufferedReader br = new BufferedReader(red)
				) {
			while (true) {
				String line = br.readLine(); // read line by line
//					if line not found return null
				if (line == null)
					break;
//					System.out.println(line);
				String[] tokens = line.split(":"); // splint line my :<- colon
				String title = tokens[0];
				int price = Integer.parseInt(tokens[1]);
				Book currentbk = new Book(title, price);// obj contain file values not hardcoded
				System.out.println(currentbk);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
