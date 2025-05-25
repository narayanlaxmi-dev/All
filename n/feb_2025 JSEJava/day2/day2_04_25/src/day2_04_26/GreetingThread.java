package day2_04_26;

// thread implementation class performing task
// print message 10 time with time gap delayTime 
public class GreetingThread extends Thread {
	private String greeting;
	private int delayTime;

	public GreetingThread(String greeting, int delayTime) {
		super();
		this.greeting = greeting;
		this.delayTime = delayTime;
	}

	public void run() {
		for(int count =1;  count<=10; count++) {
			System.out.println(greeting);
			try {
				Thread.sleep(delayTime);
			} catch (InterruptedException e) {
				e.printStackTrace(); // ADVISE in PRoject
			}
		}
	}
}
