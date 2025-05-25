package assignments_java;

public class Student {
	private String name, add;
	private int age;

	public Student() {

		name = "unknown";
		add = "not available";
		age = 0;
	}

	void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void setInfo(String name, int age, String add) {
		this.name = name;
		this.age = age;
		this.add = add;
	}

	void getInfo() {
		System.out.println("name :" + name + "\tage :" + age + "\tadd :" + add);
	}
}
