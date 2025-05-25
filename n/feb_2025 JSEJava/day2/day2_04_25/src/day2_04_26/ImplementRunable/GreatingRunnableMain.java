package day2_04_26.ImplementRunable;

public class GreatingRunnableMain {

	public static void main(String[] args) {// main thread starts
		// Runnable is interface so object class declare
		Runnable r1 = new GreetingRunable("Neyan", 1000);
		Runnable r2 = new GreetingRunable("Welcome", 500);
//		to start we have to create obj of thread clss
		Thread t1 = new Thread(r1); // set as tablet thread(r1)
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
		try { // if i cant used 21 line printed in first
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thanks for watching, visit again........"); // this also a thread
	}

}
