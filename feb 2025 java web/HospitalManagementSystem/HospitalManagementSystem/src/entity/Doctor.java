package entity;

public class Doctor {
	private static long id=000;
	private String doctorId;
	private String doctorName;
	private String specialization;
	private String contactNumber;
	private boolean isAvailable;

	public Doctor(String doctorName, String specialization, String contactNumber) {
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.contactNumber = contactNumber;
		this.doctorId="D"+ ++id;
		this.isAvailable=true;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getDoctorId() {
		return doctorId;
	}
	
	

}
