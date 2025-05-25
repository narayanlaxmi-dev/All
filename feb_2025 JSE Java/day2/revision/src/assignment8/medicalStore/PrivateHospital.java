package assignment8.medicalStore;

public class PrivateHospital extends Hospital implements MedicalServices {

	@Override
	public void Treatment() {
		System.out.println(" this is CHARGES treatment for Bhaio its PRIVATE hospital");

	}

	@Override
	public void showHospitalPolicy() {
		System.out.println("PAID PAID PAID................");
	}

}
