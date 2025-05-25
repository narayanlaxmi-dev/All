package pattern;

public class pattern10 {

	public static void main(String[] args) {
		int row=5;
		int col=1;
		for(int i=1;i<=row;i++)//for rows
		{
			for(int j=1;j<=col;j++)//for columns
			{
				System.out.print(i%2);
				
			}
			col++;
			System.out.println();
	}

	}

}
