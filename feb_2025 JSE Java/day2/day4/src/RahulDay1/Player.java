package RahulDay1;

public class Player {

	private String name;
	private int age;

	public Player() {
		System.out.println("inside Default.....");
	}

	public Player(String name, int age) {

		System.out.println("inside parameter 1  (str ,int).....");
		this.name = name;
		this.age = age;
	}

	public Player(int age, String name) {

		System.out.println("inside parameter 2 (int ,Str).....");
		this.age = age;
		this.name = name;
	}

}
