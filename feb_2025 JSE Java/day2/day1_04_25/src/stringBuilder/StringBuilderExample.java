package stringBuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder(); // create an empty builder
		builder.append("hello, this is String builder program... ");
				builder.append(6.032f);
		builder.append(" my height long ");
		builder.append(" && ");
		builder.append(70);
		builder.append(" my weight is : ");
		builder.append(true);
		System.out.println(builder);
		String details  = builder.toString();
		System.out.println(details);
		

	}

}
