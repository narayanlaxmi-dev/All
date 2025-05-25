package pattern;

public class pattern11 {

	public static void main(String[] args) {
		  int row=6;
		  int space=5;
		  int star=1;
		  for(int i=0;i<row;i++)
		  {
			  
				  for(int k=0;k<space;k++)
				  {
				  System.out.print(" ");
			      }
				  for(int l=0;l<star;l++)
				  {
					  System.out.print("*");
				  }
			  space--;
			  star++;
				  
				  System.out.println();
			  }
		  }
}

	


