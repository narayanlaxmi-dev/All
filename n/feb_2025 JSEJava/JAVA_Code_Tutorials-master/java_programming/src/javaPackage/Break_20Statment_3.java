package javaPackage;

public class Break_20Statment_3 {

	public static void main(String[] args) {
		
		int i=1;
		
		// while loop
		while (i <= 5) { // 1,2,3,4
			
			if(i == 4) { //1,2,3 4 its match ,then break
				break;
			}
			System.out.println(i); // 1,2,3
			i++; // 2,3,4 go while
		}

	}

}
