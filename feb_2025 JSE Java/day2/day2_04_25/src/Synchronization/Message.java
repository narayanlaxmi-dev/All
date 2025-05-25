package Synchronization;

public class Message {

	private String content;

	public Message(String content) {
		super();
		this.content = content;
	}

	public void printContent() throws InterruptedException { // add synchronized keyword it protected one at a time
		// method prints message with some decorator and ti e gap
		/*
		 * start *********** <<eg 1 second>> Welcome <<1 second>> *********** <<1
		 * second>> end
		 */
		
			System.out.println("start");
			Thread.sleep(3000);
			System.out.println("***********");
			System.out.println(content);
			Thread.sleep(2000);
			System.out.println("***********");
			Thread.sleep(2000);
			System.out.println("end");
		
	}

}
