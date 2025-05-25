package assignment8.bank;

public class Customer {
	private String name;
	private int id;

	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public void display() {
		System.out.println("name:" + name + "\tid: " + id);
	}
}
