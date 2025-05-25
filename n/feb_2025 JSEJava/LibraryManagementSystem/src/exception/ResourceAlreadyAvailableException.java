package exception;

@SuppressWarnings("serial")
public class ResourceAlreadyAvailableException extends RuntimeException {

	public ResourceAlreadyAvailableException(String message) {
		super(message);
	}
}
