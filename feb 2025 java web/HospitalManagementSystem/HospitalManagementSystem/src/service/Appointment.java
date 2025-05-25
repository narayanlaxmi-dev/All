package service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import CustomException.DoctorNotFoundException;
import CustomException.DoctorUnavailableException;
import CustomException.PatientNotFoundException;
import entity.*;

public class Appointment {
	private ArrayList<AppointmentRecord> appointments = new ArrayList<>();
	private Hospital hospital; // 
	private final String logFile = "D:\\MyFile.txt.txt"; 

	public Appointment(Hospital hospital) {
		this.hospital = hospital;
	}

	private void logAppointmentDetails(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }
	
	public void scheduleAppointment(String patientId, String doctorId) throws DoctorUnavailableException,DoctorNotFoundException,PatientNotFoundException {
		Doctor doctor = hospital.getDoctor(doctorId);
		Patient patient=hospital.getPatient(patientId);

		if (doctor != null && doctor.isAvailable()) {
			AppointmentRecord newAppointment = new AppointmentRecord(patientId, doctorId);
			appointments.add(newAppointment);

			// Set doctor availability to false since appointment is scheduled.
			doctor.setAvailable(false);
			
			  String logMessage = "Appointment scheduled successfully: " +
	                    "\nDoctor: " + doctor.getDoctorName() +
	                    "\nPatient ID: " + patientId +
	                    "\nDate: " + newAppointment.getAppointmentDate() +
	                    "\nAppointment ID: " + newAppointment.getAppointmentId() + "\n";
	            logAppointmentDetails(logMessage);

			System.out.println("Appointment scheduled successfully with Dr. " + doctor.getDoctorName() + " on "
					+ newAppointment.getAppointmentDate() + ". Appointment ID: " + newAppointment.getAppointmentId());
		} else if (doctor == null) {
			throw new DoctorNotFoundException("Doctor is not found for this id");
		} 
		
	      else if (patient == null) {
		throw new PatientNotFoundException("patient is not found for this id");
	    } 
		
		
		else {
			throw new DoctorUnavailableException("Doctor " + doctor.getDoctorName() + " is not available.");
		}
	}

	public void cancelAppointment(String appointmentId) {
		AppointmentRecord appointmentToRemove = null;
		for (AppointmentRecord appointment : appointments) {
			if (appointment.getAppointmentId().equals(appointmentId)) {
				appointmentToRemove = appointment;
				break;
			}
		}

		if (appointmentToRemove != null) {
			// Free the doctor after canceling the appointment
			Doctor doctor = hospital.getDoctor(appointmentToRemove.getDoctorId());
			if (doctor != null) {
				doctor.setAvailable(true);
			}

			appointments.remove(appointmentToRemove);
			   		 String logMessage = "Appointment cancelled: " +
	                    "\nAppointment ID: " + appointmentId +
	                    "\nDoctor ID: " + appointmentToRemove.getDoctorId() +
	                    "\nPatient ID: " + appointmentToRemove.getPatientId() + "\n";
	            logAppointmentDetails(logMessage);
	            
			System.out.println("Appointment " + appointmentId + " cancelled successfully.");
		} else {
			System.out.println("Appointment not found.");
		}
	}

	public ArrayList<AppointmentRecord> displayAppointmentsByDoctor(String doctorId) {
		ArrayList<AppointmentRecord> doctorAppointments = new ArrayList<>();
		for (AppointmentRecord appointment : appointments) {
			if (appointment.getDoctorId().equals(doctorId)) {
				doctorAppointments.add(appointment);
			}
		}
		return doctorAppointments;
	}

	public ArrayList<AppointmentRecord> displayAppointmentsByPatient(String patientId) {
		ArrayList<AppointmentRecord> patientAppointments = new ArrayList<>();
		for (AppointmentRecord appointment : appointments) {
			if (appointment.getPatientId().equals(patientId)) {
				patientAppointments.add(appointment);
			}
		}
		return patientAppointments;
	}
}
