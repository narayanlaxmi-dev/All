package Exception.Throws;

// user define specific class
public class InvalidPasswordException extends Exception {// sice this class inherit exception it Checked Exception
// runtimeException is parent of UNCHECKED
	public InvalidPasswordException(String errorMessage) {
		super(errorMessage);
	}
}
