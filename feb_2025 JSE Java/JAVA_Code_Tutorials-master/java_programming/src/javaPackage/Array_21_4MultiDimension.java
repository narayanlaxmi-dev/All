package javaPackage;

public class Array_21_4MultiDimension {

	//Multi Dim
	public static void main(String[] args) {
		
		//defining multi dimensional ARRAY
		int a[][] = { { 4, 2, 3, 4, 5}, { 9, 8, 7, 6, 0}, { 5, 6 ,7 , 8, 9} };
		
		//total no of rows
		int row = a.length; // .length is property of an array not method
		System.out.println("Total no. of rows : "+ row);
		
		//total no of columns
		int column = a[0].length;
		System.out.println("Total no. of columns : "+ column);
		
		//print all data in matrix
		for(int i=0; i<row; i++) {
			
			// inner loop
			for (int j=0; j<column; j++) {
				
				System.out.print(a[i][j] + "   "); // we use print to continue line print and 3 space  
			}
			System.out.println(); // for next line
		}
		
	}

}
