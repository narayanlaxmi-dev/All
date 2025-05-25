package pattern;

public class pattern5 {

	public static void main(String[] args) {
		int row=5;
		int col=5;
		for(int i=0;i<row;i++)//for rows
		{
			for(int j=0;j<col;j++)//for columns
			{
				System.out.print((i+j)%2+"");
			}
			System.out.println();
	}
		

	}

}
