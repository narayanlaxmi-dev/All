package entity;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private String id;
	private String name;
	private List<Book> books; // member has book manyform use collection list

	private static int Mid;

	static {
		Mid = 200;
	}

	public Member() {
	}

	public Member(String name) {
		this.id = "M" + ++Mid;
		this.name = name;
		this.books = new ArrayList<Book>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", books=" + books + "]";
	}

	public void borrowBook(Book book) {
		books.add(book); // adding a book
		System.out.println(book.getTitle() + " borrowed by " + this.name);
	}

	public void returnBook(Book book) {
		books.remove(book);
		System.out.println(book.getTitle() + " Returned  by " + this.name);
	}
}
