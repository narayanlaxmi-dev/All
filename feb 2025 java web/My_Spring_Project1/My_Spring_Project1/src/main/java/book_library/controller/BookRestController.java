package book_library.controller;

import java.util.Collection;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import book_library.entity.Book;
import book_library.service.BookService;

@RestController
public class BookRestController {

	@Autowired
	private BookService bookServiceRefrence;
	
	@GetMapping("/books-api")
	public Collection<Book> getAllBooks(){
		Collection<Book> allAvailableBooks=
				bookServiceRefrence.getallBooks();
		return allAvailableBooks;
	}
	
	@GetMapping("/books-api/{book_id}")
	public Book getOneBook(@PathVariable("book_id")  int bookId) {
		Book foundBook=bookServiceRefrence.getOneBook(bookId);
		return foundBook;
	}
	
	@PostMapping("/books-api")
	public void createNewBook(@RequestBody Book newBook) {
		System.out.println("new book added"+newBook);
		bookServiceRefrence.createNewBook(newBook);
	}
}
