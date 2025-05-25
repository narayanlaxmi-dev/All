package entity;

import java.time.LocalDateTime;

public class AppointmentRecord {
    static long id=0;
	String patientId;
	String doctorId;
	String appointmentId;
	LocalDateTime appointmentDate;

	public AppointmentRecord(String patientId, String doctorId) {
		super();
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.appointmentId = "APT" + ++id;
		this.appointmentDate = appointmentDate.now();
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDateTime appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

}
