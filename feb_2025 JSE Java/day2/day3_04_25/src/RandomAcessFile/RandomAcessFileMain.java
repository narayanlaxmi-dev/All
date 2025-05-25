package RandomAcessFile;

import java.io.RandomAccessFile;

public class RandomAcessFileMain {
	public static void main(String[] args) {
		String filePath = "./src/files/greetings.txt";
		try (RandomAccessFile rf = new RandomAccessFile(filePath, "r")) { // Corrected typo here
			long fileSize = rf.length();
			long midPosition = fileSize / 2; // from mid position file read
			rf.seek(midPosition);
			while (true) {
				int data = rf.read();
				if (data == -1)
					break;
				char ch = (char) data;
				System.out.print(ch); // print each character to see the result
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
