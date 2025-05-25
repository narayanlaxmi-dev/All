package Assignment;

class Resources {
	private int data;
	private boolean available = false;

	public synchronized void produceResource(int no) {
		while (available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		data = no;
		System.out.println("Produced " + data);
		available = true;
		notify();
	}

	public synchronized void consumeResource() {
		while (!available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumed " + data);
		available = false;
		notify();
	}
}

class Producer extends Thread {
	private Resources r;

	public Producer(Resources r) {
		this.r = r;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			r.produceResource(i);
		}
	}
}

class Consumer extends Thread {
	private Resources r;

	public Consumer(Resources r) {
		this.r = r;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			r.consumeResource();
		}
	}
}

public class InterThreadCommunicationMain {
	public static void main(String[] args) {
		Resources resources = new Resources();

		Producer producer = new Producer(resources);
		Consumer consumer = new Consumer(resources);

		producer.start();
		consumer.start();
		System.out.println("inter-communicated");
	}
}
