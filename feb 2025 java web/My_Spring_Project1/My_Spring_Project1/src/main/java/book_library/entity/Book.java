package book_library.entity;

public class Book {

	private int bootId;
	private String title;
	private String author;
	private float price;
	
	public Book() {
		
	}

	public Book(int bootId, String title, String author, float price) {
		this.bootId = bootId;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public int getBootId() {
		return bootId;
	}

	public void setBootId(int bootId) {
		this.bootId = bootId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bootId=" + bootId + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
