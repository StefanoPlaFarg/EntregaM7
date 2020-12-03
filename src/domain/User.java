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
	Timestamp timeStamp;
	
	
	public User () {
		
		
	}
	
   public User (String name, String surname, String password, Timestamp timeStamp  ) {
	   this.name=name;
	   this.surname=surname;
	   this.password=password;
	   this.timeStamp=timeStamp;
	}

}
