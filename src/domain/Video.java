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
		this.url = null;
		this.title = null;	
		tagsList = new ArrayList<String> ();
		
	}
	
	public Video(String url, String title) {

		this.url = url;
		this.title = title;
		tagsList = new ArrayList<String> ();

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
	public void setUrl(String url)throws Exception {
		 if (url.equals(""))
		throw new Exception("Falta introduir l'url");
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
	public void setTitle(String title) throws Exception {
		 if (title.equals(""))
				throw new Exception("Falta introduir el titol");
		this.title = title;
	}
	
	public ArrayList<String> getTagsList(){
	
	return tagsList;
	
	}
	
	public boolean containsTag (String title ) throws Exception{
		
		
	}

}
