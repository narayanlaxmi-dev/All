package RahulDay1;

public class OfflineTraining extends Training {

	private String venue;

	public OfflineTraining() {
		venue = "PG DAC ";
	}

	public OfflineTraining(String module_name, int duration, String venue) {
		super(module_name, duration);
		this.venue = venue;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public void conductTraining() {

		System.out.println("conducting OFFLINE training at :" + venue + " moducle name is :" + getModule_name()
				+ " for :" + getDuration() + " Hours");
	}

	public  String getDetails() {
		String trainingDetails = super.getDetails();
		String venudetails = " <-> venue " + venue;
		String finalDetails = trainingDetails + venudetails;
		return finalDetails;
	}
}
