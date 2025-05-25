package book_library.store;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import book_library.entity.Book;
public class BookStore {

	private static Map<Integer,Book> allBooks;
	static{
		allBooks=new HashMap<>();
		Book b1=new Book(101,"Java Complet Refrence","Patrick Naughton",875.35f);
		Book b2=new Book(102,"Let as C","Yashwant k",550.25f);
		Book b3=new Book(103,"Let as C++","Yashwant k",645.75f);
   
		allBooks.put(b1.getBootId(), b1);
		allBooks.put(b2.getBootId(), b2);
		allBooks.put(b3.getBootId(), b3);
	}
	
	public static Collection<Book> getallBooks(){
	Collection<Book> allAvailableBooks=	allBooks.values();
	return allAvailableBooks;
	}
	
	public static Book getOneBook(int bootId) {
	Book foundbook=allBooks.get(bootId);
	return foundbook;
	}
	
	public static void createNewBook(Book newBook) {
		allBooks.put(newBook.getBootId(), newBook);
	}
}
