package pattern;

public class pattern20 {

	public static void main(String[] args) {
		int row=5;
		int col=5;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==2 || j==2)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	

	}

}
