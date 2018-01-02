package com.stackroute.activitystream.serviceimpl;

import java.util.List;

import com.stackroute.activitystream.model.User;
import com.stackroute.activitystream.service.UserService;

/*
* Service classes are used here to implement additional business logic/validation 
* This class has to be annotated with @Service annotation.
* @Service - It is a specialization of the component annotation. It doesn’t currently 
* provide any additional behavior over the @Component annotation, but it’s a good idea 
* to use @Service over @Component in service-layer classes because it specifies intent 
* better. Additionally, tool support and additional behavior might rely on it in the 
* future.
* */
public class UserServiceImpl implements UserService{

	/*
	 * Autowiring should be implemented for the UserRepository.
	 *  Please note that we should not create any object using the new keyword.
	 * */
	

	/*
	 * This method should be used to save a new user. Call the corresponding method of Respository interface.
	 * 
	 */
	public boolean save(User user) {

		return false;
	}

	/*
	 * This method should be used to update an existing user. Call the corresponding method of Respository interface.
	 * 
	 */
	public boolean update(User user) {

		return false;

	}

	/*
	 * This method should be used to delete an existing user. Call the corresponding method of Respository interface.
	 * 
	 */
	public boolean delete(User user) {

		return false;
	}

	/*
	 * This method should be used to list all users. Call the corresponding method of Respository interface.
	 * 
	 */
	public List<User> list() {
		return null;
	}

	/*
	 * This method should be used to validate a user using password. Call the corresponding method of Respository interface.
	 * 
	 */
	public boolean validate(String username, String password) {

		return false;
	}

	/*
	 * This method should be used to get a user by username. Call the corresponding method of Respository interface.
	 */
	public User get(String username) {
		return null;

	}

	/*
	 * This method is used to check whether a user with a specific username exists. Call the corresponding method of Respository interface.
	 */
	public boolean exists(String username) {

		return false;

	}
}
