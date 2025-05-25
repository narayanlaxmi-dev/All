package assignment_java4abstract;

public class Television extends ElectronicDevice {

	public Television(String eleName) {
		super(eleName);
	}

	@Override
	int powerConsumption() {
		return 1200;
	}

	@Override
	int devicetype() {
		return 03;
	}

}
