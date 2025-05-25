package RahulDay1;

public class TrainingMain {
	// static type compiler time ------>Training tr;
	// dynamic type run time -----------> new OfflineTraining();

	public static void main(String[] args) {
		Training tr;// refrence in stack
//		tr = new Training();//heap memory dynamically
		tr = new OfflineTraining();// dynamic

		System.out.println("--------------------------------------- \nover ride replace old method\n");
		tr.conductTraining();

		System.out.println("--------------------------------------- \nover ride extend old+new method");
		Training tr1 = new OnilneTraining(); // polymorphism behaviour
		tr1.conductTraining();

		System.out.println("\nBase class ");
		System.out.println(tr.getDetails());

		// has to be invoked type Casting
		// implicit type cast and explicit type cast
		OfflineTraining offtr = (OfflineTraining) tr; // type cast obj refrence
		System.out.println(offtr.getVenue());
		// or
		System.out.println(((OfflineTraining) tr).getVenue());
	}

}
