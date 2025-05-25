package day1;

import java.util.Scanner;

public class PersonMain {
	private static int eventid;

	// static block executes before main runs and initializes
	static {
		eventid = 100;
	}

	public static void main(String[] args) {
		System.out.println("Person Registration System");

		Scanner sc = new Scanner(System.in);
		int size = 0; // initialize size to 0
		System.out.println("Enter number of participants: ");
		int n = sc.nextInt();
		Person[] persons = new Person[n]; // array of Person to store participants

		boolean exit = true;
		do {
			System.out.println("+++++++++ MENU ++++++++\n" + "1. Register Participants \n" + "2. Get all Participants\n"
					+ "3. Get Participant Details\n" + "0. Exit \n" + "Choose an option:");

			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thank you for using the system.");
				exit = false;
				break;

			case 1: {

				if (size < n) {
					// Handle registration of new participants (Teacher or Student)
					System.out.println("Choose type of participant:\n1. Teacher\n2. Student");
					int participantChoice = sc.nextInt();
					Person person = null;

					switch (participantChoice) {
					case 1: // Teacher
						System.out.println("Enter id, name, city, college name, qualification:");
						person = new Teacher(++eventid, sc.next(), sc.next(), sc.next(), sc.next());
						break;
					case 2: // Student
						System.out.println("Enter roll number, name, city, school name:");
						person = new Student(++eventid, sc.next(), sc.next(), sc.next(), sc.nextFloat());
						break;
					default:
						System.out.println("Invalid choice! Try again.");
						break;
					}

					// Store the created person if valid
					if (person != null ) {
						persons[size++] = person;
						System.out.println(person.getName() + " Registered successfully with ID: " + eventid);
					}
					break;
				}
			}
			case 2: // Display all participants
				System.out.println("\n___________ All Participants ___________\n");
				for (int i = 0; i < size; i++) {
					if (persons[i] != null) {
						System.out.println(persons[i]);
					}
				}
				break;

			case 3: // Get details specific participant
				System.out.println("Enter participant ID to get details:");

				break;
			default:
				System.out.println("Invalid choice! Try again.");
				break;
			}

		} while (exit);

		sc.close();
	}
}
