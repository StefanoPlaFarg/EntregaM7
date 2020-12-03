/**
 * 
 */
package persistence;

import java.util.ArrayList;

import domain.User;


/**
 * @author stefano
 *
 */
public class UserRepository {
	
	private  ArrayList<User> userRepository=new ArrayList<>();

	public ArrayList<User> getAllUsers(){
		return new ArrayList<>(userRepository);
	}
	
	
	
	
	public void addUser(User user) throws Exception{
		if(user==null) throw new Exception();
		userRepository.add(user);
	}
	
	
}
