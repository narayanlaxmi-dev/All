package assignments_java2;

public class Book {

	int bookId;
	String title;
	String auther;

	public Book(int bookId, String title, String auther) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.auther = auther;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", auther=" + auther + "]";
	}

}