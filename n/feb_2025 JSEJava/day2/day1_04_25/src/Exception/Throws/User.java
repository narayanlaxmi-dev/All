package Exception.Throws;

public class User {
	private String username;
	private String password; // min 8 max 15 number & InvalidPasswordException

	public User() {
		username = "unKnown";
		password = "reset123";
	}

	public User(String username, String password) throws InvalidPasswordException {
		this.username = username;
		if (password.length() > 8 || password.length() < 15) {
			InvalidPasswordException ipx = new InvalidPasswordException(
					"invalid password check condition ==>" + password);
			throw ipx;

		}
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws InvalidPasswordException {
		if (password.length() > 8 || password.length() < 15) {
			InvalidPasswordException ipx = new InvalidPasswordException(
					"invalid password check condition ==>" + password);
			throw ipx;
		}
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

}
