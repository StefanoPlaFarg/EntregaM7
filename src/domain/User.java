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
public void setName(String name) {
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
public void setSurname(String surname) {
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
public void setPassword(String password) {
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

public void createVideo(Video video) {
	videoList.add(video);
}

public Video getVideoByTitle(String Title) {
	return new Video();
	//TODO acabar el return
}


}
