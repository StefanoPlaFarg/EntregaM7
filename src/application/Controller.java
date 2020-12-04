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
	
	public User getUser (String name, String surname, String password) throws Exception {
		
		if (name.equals(""))
			throw new Exception("Falta introduir el nom");
		if (surname.equals(""))
			throw new Exception("Falta introduir el cognom");
		if (password.equals(""))
			throw new Exception("Falta introduir el password");
		
		
		for (User user:repository.getAllUsers()) {
			
			if (user.getName().equals(name)&& user.getSurname().equals(surname)&& user.getPassword().equals(password)) {
				return user;
			}
		}
		
		return null;
	}
	
	
	public void addVideo(String name, String surname, String password, String title) throws Exception{
		//Si algun camp es buit excepcio
		//Si no existeix usuaris o llista buida excepcio
		//Si el titol ja existeix exepcio
		
		if (name.equals(""))
			throw new Exception("Falta introduir el nom");
		if (surname.equals(""))
			throw new Exception("Falta introduir el cognom");
		if (password.equals(""))
			throw new Exception("Falta introduir el password");
		
		User user= getUser (name,surname,password);
		if (user==null) {
			throw new Exception("L'usuari no existeix");
			
		}else {
			
			user.addVideo(title);
		}
		
		
	}
	
	
	

}
