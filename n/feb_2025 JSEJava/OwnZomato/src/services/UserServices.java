package services;

import java.util.List;
import dao.UserDao;
import entity.User;
import exception.ResourceNotFoundException;

public class UserServices {

	// composition Has A
	private UserDao userdaoInstances;

	public UserServices() {
		userdaoInstances = UserDao.getUserDaoInstance();
	}

	// register user
	public void reggisteredUser(String name, String phoneNumber, String pinCode) {
		// userservice depent on suerdao to store object

		User newuser = new User(name, phoneNumber, pinCode);
		userdaoInstances.save(newuser);
	}

	public User getuserByID(String id) {
		User u1 = userdaoInstances.findAll().stream().filter(user -> user.getId().equalsIgnoreCase(id)).findFirst()
				.orElseThrow(() -> new ResourceNotFoundException("User not found ID: " + id));
		return u1;
	}

	// login in user
	public void login(String id) {

		User userbhai = getuserByID(id);
		userdaoInstances.setLoggedinUser(userbhai);

		System.out.println(" LOGIN SUCCESSFULLY ! for name: " + userbhai.getName());
	}

	public List<User> getAllUser() {
		return userdaoInstances.findAll();
	}

}
