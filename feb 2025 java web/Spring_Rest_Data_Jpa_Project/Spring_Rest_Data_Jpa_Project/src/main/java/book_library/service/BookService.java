package book_library.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book_library.entity.Book;
import book_library.repository.BookRepository;

@Service  // Marks this class as service
public class BookService {
  
	@Autowired
	private BookRepository bookRepositoryRefrence;
	
	public Collection<Book> getallBooks() {
	Collection<Book> allBooks=	bookRepositoryRefrence.findAll();
	return allBooks;
	}
	
	public Book getOneBook(int bookId) {
		Book  foundBook=null;
	Optional<Book> optional =	bookRepositoryRefrence.findById(bookId);
	if(optional.isPresent())
		foundBook=optional.get();
	return foundBook;
	}
	
	public void createNewBook(Book newBook) {
		bookRepositoryRefrence.save(newBook);
	}
	public void updateExestingBook(Book newBook) {
		bookRepositoryRefrence.save(newBook);
	}
	
	public void deleteOneBook(int BookId) {
		bookRepositoryRefrence.deleteById(BookId);
	}
    
}
