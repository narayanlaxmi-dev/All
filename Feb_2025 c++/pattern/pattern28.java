package patterns;

public class pattern28 {

	public static void main(String[] args) {
	
		

			 for (int i = 0; i < 7; i++) { 
		            for (int j = 0; j < 7; j++) { 
		                // Determine when to print '*'
		                if (j == i || j == (7 - 1 - i)) { 
		                    System.out.print("*  "); 
		                } else {
		                    System.out.print("     "); 
		                }
		            }
		            System.out.println(); // Move to the next line
		        }
		    }
		}
	//OUTPUT
	/*

	*                           *  
	     *                 *       
	          *       *            
	               *                 
	          *       *            
	     *                 *       
	*                           *  

	           
	*/