package assignment_java4abstract;

public class SmartPhone extends ElectronicDevice {

	public SmartPhone(String eleName) {
		super(eleName);
	}

	@Override
	int powerConsumption() {
		return 120;
	}

	@Override
	int devicetype() {
		return 01;
	}

}
