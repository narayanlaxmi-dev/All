package pattern;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=6;
		int col=1;
		int space=2;
		for(int i=1;i<row;i++)//for rows
		{
			for(int j=0 ;j<=space;j++)//for columns
			{
				System.out.print( " ");
				
			}
			for(int l=0;l<col;l++)
			  {
				  System.out.print(""+i+l );
			  }
		   space--;
			col++;
			System.out.println();
	}

	}

}
