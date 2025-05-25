package assignments_java;

public class MainStudent {

	public static void main(String[] args) {
		Student s[] = new Student[10];
		
		
		 for (int i = 0; i < 10; i++) {
	            s[i] = new Student();
	        }

	        // Setting student information
	        s[0].setInfo("Narayan", 1);
	        s[1].setInfo("Neyan", 3);
	        s[2].setInfo("Han", 2);
	        s[3].setInfo("Man", 3);
	        s[4].setInfo("Shi", 4);
	        s[5].setInfo("Va", 5, "Hello");
	        s[6].setInfo("Rama", 6, "Qqqqq");
	        s[7].setInfo("Shiva", 7, "Wwwww");
	        s[8].setInfo("Cv", 8, "Eeeee");
	        s[9].setInfo("Po", 9, "Rrrrr");

	        // Displaying student information
	        for (int i = 0; i < 10; i++) {
	            s[i].getInfo();
	        }
	}

}
