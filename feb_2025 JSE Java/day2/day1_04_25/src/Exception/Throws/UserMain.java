package Exception.Throws;

public class UserMain {

	public static void main(String[] args) {
		User userone = null, usertwo = null;
		userone = new User();
		try {
			usertwo = new User("narayan ", "abcd1234");
			usertwo.setPassword("12345678");
			usertwo.setUsername("neyan");
			System.out.println(usertwo.toString());
		} catch (InvalidPasswordException e) {
//		e.printStackTrace();
			String msg = e.getMessage();
			System.out.println(msg);
		} finally {
			System.out.println(userone);
			if (usertwo != null)
				System.out.println(usertwo);
		}

	}

}
