package RandomAcessFile;

public class Book {
	private String title;
	private int price;

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ",\t price=" + price + "]";
	}

}
