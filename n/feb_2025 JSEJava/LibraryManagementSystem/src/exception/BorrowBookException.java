package exception;

@SuppressWarnings("serial")
public class BorrowBookException extends RuntimeException {
	public BorrowBookException(String msg) {
		super(msg);
	}
}
