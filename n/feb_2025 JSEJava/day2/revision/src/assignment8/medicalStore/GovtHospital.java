package assignment8.medicalStore;

public class GovtHospital extends Hospital implements MedicalServices {

	@Override
	public void Treatment() {
		System.out.println(" this is free treatment for Indian people only GOVERMENT");

	}

	@Override
	public void showHospitalPolicy() {
		System.out.println("FREE FREE FREE................");
	}

}
