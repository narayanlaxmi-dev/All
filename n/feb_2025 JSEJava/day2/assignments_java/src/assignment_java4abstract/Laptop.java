package assignment_java4abstract;

public class Laptop extends ElectronicDevice {

	public Laptop(String eleName) {
		super(eleName);
	}

	@Override
	int powerConsumption() {
		return 200;
	}

	@Override
	int devicetype() {
		return 02;
	}

}
