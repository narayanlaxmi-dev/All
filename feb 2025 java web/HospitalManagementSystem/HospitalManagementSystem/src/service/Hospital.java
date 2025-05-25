package service;

import java.util.HashMap;

import entity.*;

public class Hospital {
	private HashMap<String, Patient> patients = new HashMap<>();
	private HashMap<String, Doctor> doctors = new HashMap<>();

	public void addPatient(Patient patient) {
		patients.put(patient.getPatientId(), patient);
		System.out.println("Patient added: " + patient.getPatientName());
	}

	public void removePatient(String patientId) {
		patients.remove(patientId);
		System.out.println("Patient removed: " + patientId);
	}

	public void updatePatient(String patientId, Patient updatedPatient) {
		patients.put(patientId, updatedPatient);
		System.out.println("Patient updated: " + patientId);
	}

	public void addDoctor(Doctor doctor) {
		doctors.put(doctor.getDoctorId(), doctor);
		System.out.println("Doctor added: " + doctor.getDoctorName());
	}

	public void removeDoctor(String doctorId) {
		doctors.remove(doctorId);
		System.out.println("Doctor removed: " + doctorId);
	}

	public void updateDoctor(String doctorId, Doctor updatedDoctor) {
		doctors.put(doctorId, updatedDoctor);
		System.out.println("Doctor updated: " + doctorId);
	}

	public void displayAllPatients() {
		for (Patient patient : patients.values()) {
			System.out.println(patient.getPatientName() + " (" + patient.getPatientId() + ")");
		}
	}

	public void displayAllDoctors() {
		for (Doctor doctor : doctors.values()) {
			System.out.println(doctor.getDoctorName() + " (" + doctor.getDoctorId() + ")");
		}
	}

	public Doctor getDoctor(String doctorId) {
		return doctors.get(doctorId);
	}

	public Patient getPatient(String patientID) {
		return patients.get(patientID);
	}
}
