/**
 * 
 */
package domain;

import java.util.ArrayList;

/**
 * @author stefano
 *
 */
public class Video {
	
	private String url;
	private String title;
	private ArrayList<String> tagsList ;
	
	
	public Video() {
		
		
	}
	
	public Video(String url, String title) {

		this.url = url;
		this.title = title;

	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	public ArrayList<String> getTagsList(){
	
	return tagsList;
	
	}

}
