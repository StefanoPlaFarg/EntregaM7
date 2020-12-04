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
	
	
  public User getUser (String name, String surname, String password) throws Exception {
	
	if (name.equals(""))
		throw new Exception("Falta introduir el nom");
	if (surname.equals(""))
		throw new Exception("Falta introduir el cognom");
	if (password.equals(""))
		throw new Exception("Falta introduir el password");
	
	
	for (User user:userRepository) {
		
		if (user.getName().equals(name)&& user.getSurname().equals(surname)&& user.getPassword().equals(password)) {
			return user;
		}
	}
	
	return null;
}
	
	
}
