package RahulDay1;

public class OnilneTraining extends Training {

	private String meetingLink;

	public OnilneTraining() {
		meetingLink = "www.link";
	}

	public OnilneTraining(String module_name, int duration, String meetingLink) {
		super(module_name, duration);
		this.meetingLink = meetingLink;
	}

	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}

	public void conductTraining() {
		super.conductTraining();
		System.out.println("conducting ONLINE training using link :" + meetingLink + " on :" + getModule_name()
				+ " for :" + getDuration() + " Hours");
	}

}
