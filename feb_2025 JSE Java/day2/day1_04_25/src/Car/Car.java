package Car;

import day1_04_25.Motor;

public class Car {

	private String model;
	private String color;
	private Motor engine;
//	    private day1_04_25.Motor e1;

	// Constructor
	public Car(String model, String color, Motor engine) {
		this.model = model;
		this.color = color;
		this.engine = engine;
	}

	// Method to display car details
	public void displayCarDetails() {
		System.out.println("Car Model: " + model);
		System.out.println("Car Color: " + color);
		engine.displayEngineDetails();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Motor getEngine() {
		return engine;
	}

	public void setEngine(Motor engine) {
		this.engine = engine;
	}
}

