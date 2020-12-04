/**
 * 
 */
package domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author stefano
 *
 */
public class User {
	
	private String name;
	private String surname;
	private String password;
	protected Timestamp timeStamp;
	protected ArrayList<Video> videoList;
	
	
	public User () {
		
		
	}
	
   public User (String name, String surname, String password, Timestamp timeStamp  )throws Exception {
	    if (name.equals(""))
			throw new Exception("Falta introduir el nom");
		if (surname.equals(""))
			throw new Exception("Falta introduir el cognom");
		if (password.equals(""))
			throw new Exception("Falta introduir el password");
		if (timeStamp.toString().equals(""))
			throw new Exception("Falta introduir el timestamp");
	   
	   this.name=name;
	   this.surname=surname;
	   this.password=password;
	   this.timeStamp=timeStamp;
	   videoList = new ArrayList<Video>();
	}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) throws Exception  {
	 if (name.equals(""))
			throw new Exception("Falta introduir el nom");
	this.name = name;
}

/**
 * @return the surname
 */
public String getSurname() {
	return surname;
}

/**
 * @param surname the surname to set
 */
public void setSurname(String surname)throws Exception {
	if (surname.equals(""))
		throw new Exception("Falta introduir el cognom");
	this.surname = surname;
}

/**
 * @return the password
 */
public String getPassword() {
	return password;
}

/**
 * @param password the password to set
 */
public void setPassword(String password)throws Exception {
	if (password.equals(""))
		throw new Exception("Falta introduir el password");
	this.password = password;
}

/**
 * @return the timeStamp
 */
public Timestamp getTimeStamp() {
	return timeStamp;
}

/**
 * @param timeStamp the timeStamp to set
 */
public void setTimeStamp(Timestamp timeStamp) {
	this.timeStamp = timeStamp;
}
   
   
public ArrayList<Video> getVideoList () {
	
	return videoList;
}



public void addVideo(String title) throws Exception{
	
	if  (getVideoByTitle(title)==null) {
		
		videoList.add(new Video (title));
	}else {
		
		throw new Exception ("El video ja existeix");
	}
	
}


public Video getVideoByTitle(String title) {

	for (Video video : videoList) {

		if (video.getTitle().equals(title)) {

			return video;
		}

	}

	return null;

}

public Video getVideoByUrl(String url) {
	for (Video video : videoList) {

		if (video.getTitle().equals(url)) {

			return video;
		}

	}

	return null;

}
}
