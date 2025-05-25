package day2_04_26.ImplementRunable;

// thread implementation class performing task
// print message 10 time with time gap delayTime 
public class GreetingRunable implements Runnable {
	private String greeting;
	private int delayTime;

	public GreetingRunable(String greeting, int delayTime) {
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
