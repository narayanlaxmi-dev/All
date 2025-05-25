package entity;

public class Book {
	private String id;
	private String title;
	private String author;
	private Category category;
	private boolean isAvailable;

	private static int bId;
	static {
		bId = 100;
	}

	public Book() {

	}

	public Book(String title, String author, Category category, boolean isAvailable) {
		this.id = "B" + ++bId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.isAvailable = isAvailable;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", isAvailable=" + isAvailable + "]";
	}

}
