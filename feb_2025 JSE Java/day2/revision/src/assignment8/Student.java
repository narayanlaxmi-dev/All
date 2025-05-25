package assignment8;

public class Student {
	private String name;
	private int rollNumber;

	public Student() {
		name = "unKnown";
		rollNumber = 0;
	}

	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public int getrollNumber() {
		return rollNumber;
	}

	public void setrollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Student -> name=" + name + ", rollNumber=" + rollNumber + "....";
	}

}
