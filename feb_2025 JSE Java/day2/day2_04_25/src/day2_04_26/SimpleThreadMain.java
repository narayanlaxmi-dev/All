package day2_04_26;

public class SimpleThreadMain {

	public static void main(String[] args) {
		Thread th = new multiTasking();
		th.start(); // Starts the thread
		th.run(); // simple method call not multi threading
		
	}

}
