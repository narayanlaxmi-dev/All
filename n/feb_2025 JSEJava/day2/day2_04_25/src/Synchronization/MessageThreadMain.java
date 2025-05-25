package Synchronization;

public class MessageThreadMain {
// multiple thread trying to share same data message1<messagethread<messagethreadmain
	public static void main(String[] args) {
		Message msg = new Message("Welcome");
		Thread m1 = new MessageThread(msg);
		Thread m2 = new MessageThread(msg);
		// Asynchronization
//		m1.start();
//		m2.start();
		// SYNCHRONIZED synchronized keyword in printMessage()
		m1.start();
		m2.start();
//		m1.run();
//		m2.run();
	}

}
