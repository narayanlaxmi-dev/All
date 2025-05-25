package Synchronization;

public class MessageThread extends Thread {
	private Message messobj;

	public MessageThread(Message messobj) {
		this.messobj = messobj;
	}

	public void run() {
		// synchronized block
		synchronized (messobj) { // this messobj synchronized
			// if try catch is not printContent method then used here
			try {
				messobj.printContent();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
