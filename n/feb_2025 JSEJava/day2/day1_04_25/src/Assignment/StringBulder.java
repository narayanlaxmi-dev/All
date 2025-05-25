package Assignment;

public class StringBulder {

	public static String RemoveDuplicateChar(String s) {

		char arr[] = s.toCharArray();// to this method all string convert to array
		boolean character[] = new boolean[256]; // initial all location value is false
		StringBuffer sb = new StringBuffer();

		for (char ch : arr) {
			if (character[ch] == false)
				sb.append(ch); // non repeating character store in sb...==>>>>>>>> helo mynaisr
			character[ch] = true;
		}
		System.out.println(sb);
		return sb.toString();
	}

	public static void main(String[] args) {
		// write prog to remove duplicate char form string using stringBuilder

		String str = "hello my name is narayan neyan"; // uni-code or asci-code 256 character
		String n = RemoveDuplicateChar(str);
		System.out.println("after removing duplicate : " + n);

	}

}
