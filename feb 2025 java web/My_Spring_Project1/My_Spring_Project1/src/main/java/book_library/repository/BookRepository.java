package book_library.repository;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import book_library.entity.Book;
import book_library.store.BookStore;

@Repository // marks this class as repository and is managed by Spring
public class BookRepository {

	public Collection<Book> getallBooks() {
		Collection<Book> allAvailableBooks = BookStore.getallBooks();
		return allAvailableBooks;
	}
	
	public Book getOneBook(int bookId) {
		Book foundBook=BookStore.getOneBook(bookId);
		return foundBook;
	}
	
	public void createNewBook(Book newBook) {
		BookStore.createNewBook(newBook);
	}
}
