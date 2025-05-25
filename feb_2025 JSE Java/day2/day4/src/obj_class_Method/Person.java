package obj_class_Method;

import java.util.Objects;

public class Person {
	private String first_name;
	private String last_name;
	private int age;

	public Person() {
		first_name = "neyan";
		last_name = "patil";
		age = 23;
	}

	public Person(String first_name, String last_name, int age) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
//		return "dummy "; // over ride in odject toString method
		return "Person [first_name = " + first_name + ", last_name = " + last_name + ", age = " + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, first_name, last_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(first_name, other.first_name)
				&& Objects.equals(last_name, other.last_name);
	}
}
