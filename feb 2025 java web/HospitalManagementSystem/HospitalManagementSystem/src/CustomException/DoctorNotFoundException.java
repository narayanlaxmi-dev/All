package CustomException;

public class DoctorNotFoundException extends Exception {
  public DoctorNotFoundException(String message) {
	super(message);
}
}
