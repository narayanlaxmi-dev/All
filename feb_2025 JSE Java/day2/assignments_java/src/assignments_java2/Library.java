package assignments_java2;

public class Library {
	
	Book book[];
	final int  MAX_SIZE=100;
	int size;
	
	public Library() {
	 book=new Book[MAX_SIZE];
		size=0;
	}
	
	public void addBook(Book book1) {
		if(size<MAX_SIZE) {
			book[size++]=book1;
			//size++;
		}
		else {
			System.out.println("Library is full...");
		}
		
	}
	
	
	public void removeBook(int id) {
		boolean flag=false;
		for(int i=0;i<size;i++) {
			if(book[i].bookId==id)
			{
				flag=true;
				for(int j=i;j<size-1;j++) {
					book[j]=book[j+1];
				}
				book[size-1]=null;
				size--;
			}
			
		}
		if(!flag)System.out.println("Not found in library");
		
	}
	
	public void displayBook() {
		for(int i=0;i<size;i++) {
			System.out.println(book[i]);
		}
	}
	

}