package Assignment;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class NosuchElementException {
	public static void main(String[] args) {
		try {
			String s = "hello neyan i'm  narayan";
			StringTokenizer t = new StringTokenizer(s);
			String one1 = t.nextToken();
			String one2 = t.nextToken();
			String one3 = t.nextToken();
			String one4 = t.nextToken();
			String one5 = t.nextToken();
			System.out.println(one1 + " " + one2 + " " + one3 + " " + one4 + " " + one5);
		} catch (NoSuchElementException n) {
			System.out.println("NO more TOken are available :- " + n.getMessage());
		}
	}
}
