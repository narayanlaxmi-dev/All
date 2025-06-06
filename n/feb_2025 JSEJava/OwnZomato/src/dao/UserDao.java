package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import entity.User;
import exception.ResourceNotFoundException;

public class UserDao implements AppRepository<User> {
	private Map<String, User> users;
	private User loggedinUser;
	private static UserDao userdaoInstances = null;

	public UserDao() {
		users = new HashMap<String, User>();// storing into hash map
	}

	public static UserDao getUserDaoInstance() {
		if (userdaoInstances == null)
			userdaoInstances = new UserDao();
		return userdaoInstances;

	}

	@Override
	public void save(User user) {
		users.put(user.getId(), user);
		System.out.println(user.getName() + " user Registered Successfully !");
	}

	@Override
	public List<User> findAll() {

		// this return collection convert into list
		return users.values().stream().collect(Collectors.toList());
	}

	@Override
	public User findById(String userId) {
		if (!users.containsKey(userId)) {
			throw new ResourceNotFoundException(" User not found of id: " + userId);
		}
		User foundUser = users.get(userId);

		return foundUser;
	}

	public User getLoggedinUser() {
		return loggedinUser;
	}

	public void setLoggedinUser(User loggedinUser) {
		this.loggedinUser = loggedinUser;
	}

}
