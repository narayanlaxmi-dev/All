package Assignment;

public class StringBuilder2 {

	public static String concinate(String[] arr) {
		StringBuilder sb = new StringBuilder();
		for (String token : arr) {
			sb.append(token);
		}
		return sb.toString();

	}

	public static void main(String[] args) {
		String arr[] = { "hello", "narayan", "neyan" };
		String str = concinate(arr);
		System.out.println(str);
	}
}
