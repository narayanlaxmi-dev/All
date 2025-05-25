package assignment_java4abstract;

public class ElectronicDemo {

	public static void main(String[] args) {
		ElectronicDevice ele[] = new ElectronicDevice[3];
		ele[0] = new SmartPhone("mobile");
		ele[1] = new Laptop("Laptop");
		ele[2] = new Television("Television");

		

		for (int i = 0; i < 3; i++) {
			ele[i].display();
		}

	}

}
