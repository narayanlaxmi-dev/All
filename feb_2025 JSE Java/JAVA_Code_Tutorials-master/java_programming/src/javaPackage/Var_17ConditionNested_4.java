package javaPackage;

public class Var_17ConditionNested_4 {
	
	public static void main(String[] args) {
		 int age = 23;
		 int weight = 70;
		 
		 //outer loop
		 if (age > 18) {
			 
			 //inner loop
			 if (weight > 69) {
				 System.out.println("ELIGIBLE");
			 }else {
				 System.out.println("Not-ELIGIBLE");	 
			 }
			 
		 } else {
			 System.out.println("age is not greater than 18, it's required");
		 }
	}

}
