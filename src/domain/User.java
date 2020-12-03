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
	protected List<Video> wheels = new ArrayList<Video>();
	
	
	public User () {
		
		
	}
	
   public User (String name, String surname, String password, Timestamp timeStamp  ) {
	   this.name=name;
	   this.surname=surname;
	   this.password=password;
	   this.timeStamp=timeStamp;
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
   
   

}
