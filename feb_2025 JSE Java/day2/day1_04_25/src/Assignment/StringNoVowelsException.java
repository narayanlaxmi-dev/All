package Assignment;

// own exception created
public class StringNoVowelsException extends Exception { // runtimeException then no need to try in main

	// user define exception creatred
	public StringNoVowelsException(String msg) {
		super(msg);
	}

	public static void CheckVowels(String s) throws StringNoVowelsException { // not found -1
		/*
		 * boolean hasVowels = false; String vowels = "AEIOUaeiou"; // s.indexOf('a');
		 * // check is present or not for (char ch : s.toCharArray()) { int index =
		 * vowels.indexOf(ch); if (index != -1) { hasVowels = true; break; } ch++; } if
		 * (hasVowels == false) throw new
		 * StringNoVowelsException("Does not contain vowels"); else
		 * System.out.println("vowels present ....");
		 */

		boolean hasVowels = false;
		String vowels = "AEIOUaeiou";
		for (char ch : s.toCharArray()) {
			if (vowels.indexOf(ch) != -1) {
				hasVowels = true;
				break;
			}
		}
		if (hasVowels == false)
			throw new StringNoVowelsException("Does not contain vowels");
		else
			System.out.println("vowels present ....");

	}

//	Creating constructor
	public static void main(String[] args) {
		String str = "narayan";
//		System.out.println((str));
		try {
			CheckVowels(str);
		} catch (StringNoVowelsException e) {
			e.printStackTrace();
		}
	}

}
