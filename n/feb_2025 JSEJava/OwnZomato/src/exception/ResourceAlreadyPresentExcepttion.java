package exception;

@SuppressWarnings("serial")
public class ResourceAlreadyPresentExcepttion extends RuntimeException {
	
	public ResourceAlreadyPresentExcepttion(String msg) {
		super(msg);
	}
}
