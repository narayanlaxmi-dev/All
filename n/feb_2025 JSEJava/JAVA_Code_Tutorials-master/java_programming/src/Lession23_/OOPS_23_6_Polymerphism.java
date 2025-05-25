package Lession23_;

//method OverLoading
public class OOPS_23_6_Polymerphism {
	
	public static void main(String[] args) {
		
		// print using class name and assign value
		System.out.println(OOPS_23_5_Polymerphism.add(13, 5));
		System.out.println(OOPS_23_5_Polymerphism.add(13.5, 5.5));
		
		
		
		
		// print A to Z for loop using char 
		for (char z = 'A'; z<='Z'; z++) {
			// z so next line print a to z
			//System.out.println(z); // yhis print next line horizontal a to z
			System.out.print(z + "  ");// we use print z=A __space, z=B__space & so on
		}
		
		System.out.println(); // this condition after 1 to z & then next line print 1 to 100
		
		//print 1 to 100 for using for loop
		for (int i=0; i<= 100; i++)   {
			
			//System.out.println(i); // this print horizontal print 1 to 100 in next line
			System.out.print(i + " ");
		}
		
		// odd & even number printing logic not knoun for me
		for (int j= 1; j<= 100; j++) {
			
			if (j >= 2) {
				j++;
				System.out.println(j);
			}else {
				System.out.println("even");
			}
		}
	}

}
