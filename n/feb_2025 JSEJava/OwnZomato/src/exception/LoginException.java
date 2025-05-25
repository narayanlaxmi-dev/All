package exception;

@SuppressWarnings("serial")
public class LoginException extends RuntimeException {
	public LoginException(String msg) {
		super(msg);
	}
}
