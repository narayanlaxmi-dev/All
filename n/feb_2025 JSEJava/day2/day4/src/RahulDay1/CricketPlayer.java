package RahulDay1;

public class CricketPlayer extends Player {
	private int runs;

	public CricketPlayer(String name, int age, int runs) {
		super(name, age); // paramaterized cosnt
//		super();// default const
		this.runs = runs;
	}
}
