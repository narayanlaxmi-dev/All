package Lession30_;

public class ExcptHandling_30_5 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		try {
			int a = 10 / 0 ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { // you vcan put after try or after catch
			System.out.println("finally always execute");
		}

		
		
		System.out.println("Integer.parseInt(s), EXCEPTION HANDLING, arithmeticException");
	}
	

}
