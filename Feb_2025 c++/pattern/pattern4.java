package pattern;

public class pattern4 {

	public static void main(String[] args) {
		int row=5;
		int col=5;
		char ch;
		ch='A';
		
		for(int i=0;i<row;i++)//for rows
		{
			for(int j=0;j<col;j++)//for columns
			{
				System.out.print((char)(ch+i+j));
				
			}
			System.out.println();
	}
		

	}

}
