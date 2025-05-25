package assignment_java4abstract;

public abstract class ElectronicDevice {
	String eleName;

	public ElectronicDevice(String eleName) {
		super();
		this.eleName = eleName;
	}
	abstract int powerConsumption();
	abstract int devicetype();
	void display() {
		System.out.println("Electronic Model Name :" + eleName);
		System.out.println("Power Cconsumtion " + powerConsumption());
		System.out.println("Device Type " + devicetype());
	}
}
