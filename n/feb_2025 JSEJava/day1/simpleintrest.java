
class simpleintrest{


public static void main(String args[]) {

		
 if(args.length < 3){
	System.out.println("Enter principal amount rate and year :");
	}
	int principal = Integer.parseInt(args[0]);
	float rate = Float.parseFloat(args[1]);
	int year = Integer.parseInt(args[2]);
	
	double hra = 	principal * 0.2;
	double da = 	principal * 0.5;
	float si = principal * rate * year /100;
	float amount = si + principal;


	System.out.println("The Simple interest is  :" + si);
		System.out.println(" HRA :"+ hra);
		System.out.println(" DA :"+ da);
		System.out.println("NET salary :"+ amount);

    }

}