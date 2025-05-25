package practice.entity;

public class Student {
	private int id;
	private String sName;
	private String sCity;

	public Student() {

	}

	public Student(int id, String sName, String sCity) {
		this.id = id;
		this.sName = sName;
		this.sCity = sCity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsCity() {
		return sCity;
	}

	public void setsCity(String sCity) {
		this.sCity = sCity;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ",\t sName=" + sName + ",\t sCity=" + sCity + "]";
	}
}
