package application;


import java.util.Scanner;

import CustomException.DoctorNotFoundException;
import CustomException.DoctorUnavailableException;
import CustomException.PatientNotFoundException;
import entity.*;
import service.*;

public class HospitalManagementSystem {
    private static Hospital hospital = new Hospital();
    private static Appointment appointmentManager = new Appointment(hospital);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Hospital Management System Menu ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. Cancel Appointment");
            System.out.println("5. Display All Patients");
            System.out.println("6. Display All Doctors");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    addDoctor();
                    break;
                case 3:
                    scheduleAppointment();
                    break;
                case 4:
                    cancelAppointment();
                    break;
                case 5:
                    hospital.displayAllPatients();
                    break;
                case 6:
                    hospital.displayAllDoctors();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
    }

    private static void addPatient() {
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patient age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter patient gender: ");
        String gender = scanner.nextLine();
        System.out.print("Enter patient contact number: ");
        String contactNumber = scanner.nextLine();

        Patient patient = new Patient(name, age, gender, contactNumber);
        hospital.addPatient(patient);
    }

    private static void addDoctor() {
        System.out.print("Enter doctor name: ");
        String name = scanner.nextLine();
        System.out.print("Enter doctor specialization: ");
        String specialization = scanner.nextLine();
        System.out.print("Enter doctor contact number: ");
        String contactNumber = scanner.nextLine();

        Doctor doctor = new Doctor(name, specialization, contactNumber);
        hospital.addDoctor(doctor);
    }

    private static void scheduleAppointment() {
        System.out.print("Enter patient ID: ");
        String patientId = scanner.nextLine();
        System.out.print("Enter doctor ID: ");
        String doctorId = scanner.nextLine();

        try {
            appointmentManager.scheduleAppointment(patientId, doctorId);
        } catch (DoctorUnavailableException | DoctorNotFoundException | PatientNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void cancelAppointment() {
        System.out.print("Enter appointment ID to cancel: ");
        String appointmentId = scanner.nextLine();
        appointmentManager.cancelAppointment(appointmentId);
    }
}
