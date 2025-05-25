package pattern;

public class pattern16 {

	public static void main(String[] args) {
		int row=5;
		for(int i=row;i>=1;i--)//for rows
		{
			for(int k=row-i;k>=1;k--)//for columns
			{
				System.out.print("");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
	}

	}

}
