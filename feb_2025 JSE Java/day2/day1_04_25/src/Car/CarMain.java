package Car;

import day1_04_25.Motor;

public class CarMain {

	public static void main(String[] args) {

		Motor obj1 = new Motor("v12", 1500);
		Car c1 = new Car("BMW", "blue", obj1);
		c1.getEngine();
		c1.displayCarDetails();
		
		double a = Double.parseDouble("10.23");
		System.out.println(a);
	}

}
