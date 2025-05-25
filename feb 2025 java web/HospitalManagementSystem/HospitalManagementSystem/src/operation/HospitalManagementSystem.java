package operation;

import java.util.Date;

import CustomException.DoctorNotFoundException;
import CustomException.DoctorUnavailableException;
import CustomException.PatientNotFoundException;
import entity.*;
import service.*;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create hospital instance
        Hospital hospital = new Hospital();
        
        // Add patients
        Patient patient1 = new Patient("ABC", 40, "male", "8888888888");
        Patient patient2 = new Patient("ABCD", 45, "male", "8889989888");
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Add doctors
        Doctor doctor1 = new Doctor( "Amar", "Cardiologist", "111222333");
        Doctor doctor2 = new Doctor( "Bushan", "Dermatologist", "444555666");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Create Appointment Manager
        Appointment appointmentManager = new Appointment(hospital);

        // Schedule appointments (Check for availability before scheduling)
        try {
			appointmentManager.scheduleAppointment("P1", "D1");
			appointmentManager.scheduleAppointment("P2", "D1");  // Error: Doctor not available
	        appointmentManager.scheduleAppointment("P2", "D2");  // Success
		} catch (DoctorUnavailableException e) {
			
			System.out.println("Error: " + e.getMessage());
		} catch (DoctorNotFoundException e) {
			
			System.out.println("Error: " + e.getMessage());
		} catch (PatientNotFoundException e) {
			
			System.out.println("Error: " + e.getMessage());
		}  // Success
        

        // Display all patients and doctors
        hospital.displayAllPatients();
        hospital.displayAllDoctors();

        // Cancel appointment and make the doctor available again
        appointmentManager.cancelAppointment("APT1");

        // Try scheduling with Dr. Amar again
        try {
			appointmentManager.scheduleAppointment("P2", "D1");
		} catch (DoctorUnavailableException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (DoctorNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (PatientNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} 
    }
}

