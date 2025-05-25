package entity;

import java.util.Scanner;

public class mainlib {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		Library lib = new Library();

		while (!exit) {
			System.out.println("+++++++++++++ Menu +++++++++++++");
			System.out.println("1. Add book");
			System.out.println("2. Add member");
			System.out.println("3. Display all books");
			System.out.println("4. Display all members");
			System.out.println("5. Search book by title");
			System.out.println("6. Borrow book");
			System.out.println("7. Return book");
			System.out.println("8. Remove book");
			System.out.println("0. Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			sc.nextLine(); // Consume the newline left by nextInt()

			switch (choice) {
			case 0:
				System.out.println("Thank you for using the library system.");
				exit = true;
				break;

			case 1:
				// Add book
				System.out.println("Enter book title, author, and category (CPP, BIOLOGY, MYTHOLOGY, PHYSIOLOGY): ");
				String title = sc.nextLine();
				String author = sc.nextLine();
				String categoryInput = sc.nextLine();
				try {
					Category category = Category.valueOf(categoryInput.toUpperCase()); // Convert to enum
					lib.addBook(title, author, category);
					System.out.println("Book added successfully!\n");
				} catch (IllegalArgumentException e) {
					System.err.println("Invalid category. Please enter a valid category.");
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;

			case 2:
				// Add member
				System.out.println("Enter member name: ");
				String memberName = sc.nextLine();
				lib.addMember(memberName);
				break;

			case 3:
				// Display all books
				System.out.println("Displaying all books:");
				try {
					lib.displayAllBook();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;

			case 4:
				// Display all members
				System.out.println("Displaying all members:");
				try {
					lib.displayAllMember();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;

			case 5:
				// Search book by title
				System.out.println("Enter book title to search: ");
				String searchTitle = sc.nextLine();
				try {
					Book foundBook = lib.searchBookByTitle(searchTitle);
					System.out.println("Found book: " + foundBook);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;

			case 6:
				// Borrow book
				System.out.println("Enter your member ID: ");
				String memberIdToBorrow = sc.nextLine();
				System.out.println("Enter book ID to borrow: ");
				String bookIdToBorrow = sc.nextLine();
				try {
					lib.borrowbook(memberIdToBorrow, bookIdToBorrow);
					System.out.println("Book borrowed successfully!\n");
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;

			case 7:
				// Return book
				System.out.println("Enter your member ID: ");
				String memberIdToReturn = sc.nextLine();
				System.out.println("Enter book ID to return: ");
				String bookIdToReturn = sc.nextLine();
				try {
					lib.returnbook(memberIdToReturn, bookIdToReturn);
					System.out.println("Book returned successfully!\n");
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;

			case 8:
				// Remove book
				System.out.println("Enter book ID to remove: ");
				String bookIdToRemove = sc.nextLine();
				try {
					lib.removeBook(bookIdToRemove);
					System.out.println("Book removed successfully!\n");
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;

			default:
				System.err.println("Invalid choice. Please try again.");
				break;
			}
		}

		sc.close(); // Close the scanner to avoid resource leak

	}

}
