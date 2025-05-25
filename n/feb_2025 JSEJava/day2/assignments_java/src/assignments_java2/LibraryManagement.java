package assignments_java2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library library = new Library();
		Book b1 = new Book(1, "ABC", "AAA");
		library.addBook(b1);
		library.addBook(new Book(2, "PQR", "PPP"));
		library.addBook(new Book(3, "LMN", "LLL"));
		library.displayBook();
		library.removeBook(1);
		library.displayBook();

	}

}