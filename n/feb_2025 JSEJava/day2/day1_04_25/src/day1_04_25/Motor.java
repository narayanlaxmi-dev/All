package day1_04_25;
//import Car.Car;

public class Motor {
////	Car.Car c = new Car.Car();
//	Car n = new Car();

	private String engineType;
	private int horsepower;

	// Constructor
	public Motor(String engineType, int horsepower) {
		this.engineType = engineType;
		this.horsepower = horsepower;
	}

	// Method to start the engine
	public void startEngine() {
		System.out.println("Engine of type " + engineType + " is now running with " + horsepower + " horsepower.");
	}

	// Method to display engine details
	public void displayEngineDetails() {
		System.out.println("Engine Type: " + engineType);
		System.out.println("Horsepower: " + horsepower);
	}

	// Getter and Setter methods (optional)
	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

}

