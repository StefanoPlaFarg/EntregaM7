/**
 * 
 */
package application;

import persistence.UserRepository;

import java.sql.Timestamp;
import java.util.ArrayList;


import domain.User;
import  domain.Video;


/**
 * @author stefano
 *
 */
public class Controller {
	
	private UserRepository repository;
	
	public Controller() {
		
		repository=new UserRepository();
		
	}
	
	public void addUser (String name, String surname, String password, Timestamp timeStamp )throws Exception {
		
		if (name.equals(""))
			throw new Exception("Falta introduir el nom");
		if (surname.equals(""))
			throw new Exception("Falta introduir el cognom");
		if (password.equals(""))
			throw new Exception("Falta introduir el password");
		
		
		repository.addUser(new User(name,surname, password,  timeStamp));
		
		
	}
	
	
		
 public User getUser (String name, String surname, String password) throws Exception {
		
		if (name.equals(""))
			throw new Exception("Falta introduir el nom");
		if (surname.equals(""))
			throw new Exception("Falta introduir el cognom");
		if (password.equals(""))
			throw new Exception("Falta introduir el password");
		
		
		return repository.getUser(name,surname, password);
	}
	
	public void addVideo(String name, String surname, String password, String title) throws Exception {
		if (name.equals(""))
			throw new Exception("Falta introduir el nom");
		if (surname.equals(""))
			throw new Exception("Falta introduir el cognom");
		if (password.equals(""))
			throw new Exception("Falta introduir el password");
		if (title.equals(""))
			throw new Exception("Falta introduir el titol");

		repository.getUser(name, surname, password).addVideo(title);

	}
	
	 public boolean containsVideo (String name, String surname, String password, String title) throws Exception {
			
			if (name.equals(""))
				throw new Exception("Falta introduir el nom");
			if (surname.equals(""))
				throw new Exception("Falta introduir el cognom");
			if (password.equals(""))
				throw new Exception("Falta introduir el password");
			if (title.equals(""))
				throw new Exception("Falta introduir el titol");
			
			
			return repository.getUser(name,surname, password).containsVideo(title);
		}
	 
	 
	 
	
	 public void updateTitleVideo (String name, String surname, String password, String oldTitle, String newTitle) throws Exception {
			
			if (name.equals(""))
				throw new Exception("Falta introduir el nom");
			if (surname.equals(""))
				throw new Exception("Falta introduir el cognom");
			if (password.equals(""))
				throw new Exception("Falta introduir el password");
			if (oldTitle.equals(""))
				throw new Exception("Falta introduir el titol");
			
			if (repository.getUser(name,surname, password).containsVideo(oldTitle)) {
				repository.getUser(name,surname, password).getVideoByTitle(oldTitle).setTitle(newTitle);
			}
			
			
		}
	
	
	 public String getUrlVideo (String name, String surname, String password, String title) throws Exception {
			
			if (name.equals(""))
				throw new Exception("Falta introduir el nom");
			if (surname.equals(""))
				throw new Exception("Falta introduir el cognom");
			if (password.equals(""))
				throw new Exception("Falta introduir el password");
			if (title.equals(""))
				throw new Exception("Falta introduir el titol");
			
			
			return repository.getUser(name,surname, password).getVideoByTitle(title).getUrl();
		}
	
	
	
	
	
	public void updateUrlVideo(String name, String surname, String password, String title, String url) throws Exception {
		if (name.equals(""))
			throw new Exception("Falta introduir el nom");
		if (surname.equals(""))
			throw new Exception("Falta introduir el cognom");
		if (password.equals(""))
			throw new Exception("Falta introduir el password");
		if (title.equals(""))
			throw new Exception("Falta introduir el titol");
		if (url.equals(""))
			throw new Exception("Falta introduir l'url");

		repository.getUser(name, surname, password).getVideoByTitle(title).setUrl(url);

	}
	
	public void addTag(String name, String surname, String password, String title, String tag) throws Exception {
		if (name.equals(""))
			throw new Exception("Falta introduir el nom");
		if (surname.equals(""))
			throw new Exception("Falta introduir el cognom");
		if (password.equals(""))
			throw new Exception("Falta introduir el password");
		if (title.equals(""))
			throw new Exception("Falta introduir el titol");
		if (tag.equals(""))
			throw new Exception("Falta introduir l'url");

		repository.getUser(name, surname, password).getVideoByTitle(title).addTag(tag);

	}
	
	
	
	
	public ArrayList<String>  getAllTags(String name, String surname, String password, String title) throws Exception {
		if (name.equals(""))
			throw new Exception("Falta introduir el nom");
		if (surname.equals(""))
			throw new Exception("Falta introduir el cognom");
		if (password.equals(""))
			throw new Exception("Falta introduir el password");
		if (title.equals(""))
			throw new Exception("Falta introduir el titol");
		

		return repository.getUser(name, surname, password).getVideoByTitle(title).getTagsList();

	}
	
	public String  getAllVideos(String name, String surname, String password) throws Exception {
		if (name.equals(""))
			throw new Exception("Falta introduir el nom");
		if (surname.equals(""))
			throw new Exception("Falta introduir el cognom");
		if (password.equals(""))
			throw new Exception("Falta introduir el password");
		
		return repository.getUser(name, surname, password).getAllTitlesOfVideos();

		

	}
	
	
		
}
	
		
		
	
	
	
	


