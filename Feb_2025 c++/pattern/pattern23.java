package pattern;

public class pattern23 {

	public static void main(String[] args) {
		int row=5;
		int col=5;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
				System.out.print("*");
				else
					System.out.print("0");
			}
			System.out.println();
		}
		

	}

}
