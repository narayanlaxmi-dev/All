package day2_04_26;

public class GreetingThreadMain {

	@SuppressWarnings("removal")
	public static void main(String[] args) {// main thread starts
// IMPORTANT START
				System.out.println("Currently tthreads in main");
				Thread mainthread = Thread.currentThread();
				System.out.println(mainthread);
				String mainthreadName = mainthread.getName();
				int mainthreadPriority = mainthread.getPriority();
				System.out.println("main thread name is :-" + mainthreadName);
				System.out.println("priority :- " + mainthreadPriority);

		Thread t1 = new GreetingThread("Neyan", 1000); // milisecond in 1000milisec = 1 sec
		Thread t2 = new GreetingThread("NE", 500);
		// this Start() is multi threading
		t1.start();
		t2.start();// mixture in output contract switching
//		t1.run(); // method call not multi thread only one is running state let take t1
//		t2.run();

		
//		mainthread.stop();// depricated kill
		System.out.println("if stop() runs this is not get printed");
	} // main thred ends
// IMPORTANT END
}
/*
 * learn 
 * start()
 * sleep() 
 * down are depricated--> 
 * stop() suspend() resume()
 */