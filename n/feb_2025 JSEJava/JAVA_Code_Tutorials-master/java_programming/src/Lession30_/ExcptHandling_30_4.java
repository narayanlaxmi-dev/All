package Lession30_;

public class ExcptHandling_30_4 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String s = "selenium";
		
		try {
			int i =Integer.parseInt(s);
		} catch (NumberFormatException e) {
		
			e.printStackTrace();
		} 

		
		
		System.out.println("Integer.parseInt(s), EXCEPTION HANDLING, NumberFormatException");
	}
	

}
