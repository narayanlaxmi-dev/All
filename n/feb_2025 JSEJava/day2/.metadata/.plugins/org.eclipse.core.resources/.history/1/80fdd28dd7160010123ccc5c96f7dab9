package day1;

public class Student extends Person {

	private String course;
	private float percentage;

	public Student() {
		course = "unknown";
		percentage = 0;
	}

	public Student(int id, String city, String name, String course, float percentage) {
		super(id, name, city);
		this.course = course;
		this.percentage = percentage;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public void toLearn() {
		System.out.println("hello my name is " + name + "i am student in " + course + " with qualification" + percentage
				+ "  from city is " + city);

	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", percentage=" + percentage + ", id=" + id + ", name=" + name + ", city="
				+ city + "]";
	}

}
