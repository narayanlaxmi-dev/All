package book_library.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_library.entity.Book;
import book_library.repository.BookRepository;

@Service  // Marks this class as service
public class BookService {
  
	@Autowired
	private BookRepository bookRepositoryRefrence;
	public Collection<Book> getallBooks() {
		Collection<Book> allAvailableBooks= 
				bookRepositoryRefrence.getallBooks();
		return allAvailableBooks;
	}
	
	public Book getOneBook(int bookId) {
	Book foundBook=	bookRepositoryRefrence.getOneBook(bookId);
	return foundBook;
	}
	
	public void createNewBook(Book newBook) {
		bookRepositoryRefrence.createNewBook(newBook);
	}
}
