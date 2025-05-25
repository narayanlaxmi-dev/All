package javaPackage;

public class Break_20Statment_1 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 5; i++) { // i=0,i=1,i=2,i=3,i=4
			
			//inner condition if Stat
			if (i  == 4) {  // i=0, i=1, i=2, i=3 ,i=4 then 4=4 so break came out of loop
				break;
			}
			System.out.println(i); //0 print, 1, 2 ,3
		}
		System.out.println("came out of loop, for loop ended");

	}

}
