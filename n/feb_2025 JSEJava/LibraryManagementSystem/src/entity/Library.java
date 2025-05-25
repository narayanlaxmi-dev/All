package entity;

import java.util.HashMap;
import java.util.Map;
import exception.BorrowBookException;
import exception.ResourceNotFoundException;

public class Library {
	// key value store
	private Map<String, Book> bookMap;
	private Map<String, Member> memberMap;


	public Library() {
		// hash map initated
		bookMap = new HashMap<String, Book>();
		memberMap = new HashMap<String, Member>();
	
	}

	public void addBook(String tittle, String authhor, Category category) {
		for (Book book : bookMap.values()) {
			if (book.getTitle().equalsIgnoreCase(tittle)) {
				throw new RuntimeException(tittle + " is already in the library.");
			}
		}
		Book newbook = new Book(tittle, authhor, category, true);
		bookMap.put(newbook.getId(), newbook);
		System.out.println(newbook.getTitle() + " Added successfully !!! ");

	}

	public void removeBook(String id) {
		Book removed = bookMap.remove(id);
		if (removed == null) {
			throw new ResourceNotFoundException(" Book is not available bhai !!!!" + id);
		}

		System.out.println(removed.getTitle() + " Added successfully !!! ");
	}

	public Book searchBookByTitle(String title) {

//		for (Book book : bookMap.values()) {
//			if (book.getTitle().equalsIgnoreCase(title)) {
//				return book; // Return the found book
//			}
//		}
//		throw new ResourceNotFoundException("Book not found: " + title);

		Book foundBook = bookMap.values().stream().filter(Book -> Book.getTitle().equalsIgnoreCase(title)).findFirst()
				.orElseThrow(() -> new ResourceNotFoundException("Book not found for id: " + title));
		return foundBook;
	}

	public void addMember(String name) {
		Member m = new Member(name);
		memberMap.put(m.getId(), m);
		System.out.println(m.getId() + " Added successfully !!! ");
	}

	public void borrowbook(String id, String title) {
		if (memberMap.containsKey(id)) { // find member is valid in library

			Member foundmember = memberMap.get(id); // get all member details by id
			Book foundbook = searchBookByTitle(title);// get search book by title
			if (foundbook.isAvailable()) { // book is available or not
				foundmember.borrowBook(foundbook);// give book
				foundbook.setAvailable(false); // set false isAvaiable to other member wont same book
//				__________________________________________________________________________________________________
//				to call method crate transation object ref
				Transaction.recordBorrowTransaction(foundmember.getId(), foundbook.getId());

			} else
				throw new BorrowBookException(foundbook.getTitle() + " is not available to borrower");
		} else
			throw new ResourceNotFoundException("Not available for id: " + id);
	}

	public void returnbook(String id, String title) {
		if (memberMap.containsKey(id)) {
			Member foundmember = memberMap.get(id);
			Book foundbook = searchBookByTitle(title);
			foundbook.setAvailable(true);
			foundmember.returnBook(foundbook);
			Transaction.recordreturnTransaction(foundmember.getId(), foundbook.getId());

		} else
			throw new BorrowBookException(title + " is not available to return");

	}

	public void displayAllBook() {
		bookMap.values().stream().forEach(book -> System.out.println(book));

	}

	public void displayAllMember() {
		memberMap.values().stream().forEach(member -> System.out.println(member));

	}
}
