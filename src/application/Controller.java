/**
 * 
 */
package application;

import persistence.UserRepository;

import java.sql.Timestamp;
import java.util.ArrayList;

import domain.User;


/**
 * @author stefano
 *
 */
public class Controller {
	
	private UserRepository repository;
	
	public Controller() {
		
		repository=new UserRepository();
		
	}
	
	public void createUser (String name, String surname, String password, Timestamp timeStamp ) {
		
		try {
		repository.addUser(new User(name,surname, password,  timeStamp));
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			
		}
		
	}
	
	public User getUser (String name, String surname, String password) {
		
		for (ArrayList<User> user:repository) {
			
		}
		
		return
	}
	
	
	

}
