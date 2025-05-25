package entity;

public class Patient {
	private static long id = 1000;
	private String patientId;
	private String patientName;
	private int age;
	private String gender;
	private String contactNumber;

	public Patient(String patientName, int age, String gender, String contactNumber) {
		this.patientId = "P" + ++id;
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPatientId() {
		return patientId;
	}

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", age=" + age + ", gender="
				+ gender + ", contactNumber=" + contactNumber + "]";
	}

	

}
