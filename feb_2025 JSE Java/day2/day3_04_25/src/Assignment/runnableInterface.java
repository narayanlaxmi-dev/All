package Assignment;

class numberPrint implements Runnable {
	public void run() {
		for (int count = 1; count <= 5; count++) {
			System.out.println(count + " hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class runnableInterface {

	public static void main(String[] args) {
//		Runnable n1 = new numberPrint();
//		n1.run();
		numberPrint o = new numberPrint();
		Thread t = new Thread(o);
		t.start();

	}
}