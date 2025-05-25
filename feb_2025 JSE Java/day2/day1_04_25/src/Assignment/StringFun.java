package Assignment;

// palindrome
public class StringFun {
	public static String PalindromeConvert(String s) {

		int start = 0; // index CharAt(start); // indicate 0 index
		int last = s.length() - 1;

		while (start < last) {
			if (s.charAt(start) != s.charAt(last)) {
				return "not a palindrome";
			}
			start++;
			last--;
		}
		return "palindrome";

	}

	public static void main(String[] args) {
		String str = "madam";
		System.out.println(PalindromeConvert(str));
		System.out.println(PalindromeConvert("neyan"));
	}

}
