package RahulDay1;

public class Training {
	private String module_name;
	private int duration;

	public Training() {
		module_name = "oop java";
		duration = 120;
	}

	public Training(String module_name, int duration) {
		this.module_name = module_name;
		this.duration = duration;

	}

	public String getModule_name() {
		return module_name;
	}

	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	// mannual method created
	public void conductTraining() {
		System.out.println("Conducting Trainning.....");
	}
	
	 public String getDetails() {
		 String details = "module name "+module_name+ " duration "+ duration ;
		 return details;
	 }
}
