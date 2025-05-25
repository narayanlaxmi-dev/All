package Assignment;

class numberPrinter extends Thread {
	public void run() {
		for (int count = 1; count <= 10; count++) {
			System.out.println(count);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SimpleThread1 {

	public static void main(String[] args) {
		numberPrinter n1 = new numberPrinter();
		n1.start();
//		n1.run();
	}

}
