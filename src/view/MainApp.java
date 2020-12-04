/**
 * 
 */
package view;
import java.util.ArrayList;
import java.util.Scanner;
import application.Controller;
import domain.Video;

import java.sql.Timestamp;
/**
 * @author stefano
 *
 */

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Controller controller = new Controller();
		Scanner sc = new Scanner(System.in);

		System.out.println("Creació d'un usuari:");
		System.out.println("Introdueix el nom de l'usuari:");
		String name = sc.nextLine();
		System.out.println("Introdueix el cognom de l'usuari:");
		String surname = sc.nextLine();
		System.out.println("Introdueix el password de l'usuari:");
		String password = sc.nextLine();

		try {

			controller.addUser(name, surname, password, new Timestamp(System.currentTimeMillis()));
			String printName = controller.getUser(name, surname, password).getName();
			String printSurname = controller.getUser(name, surname, password).getSurname();
			Timestamp printTimestamp = controller.getUser(name, surname, password).getTimeStamp();
			System.out.print("L'usuari " + printName + printSurname + " s'ha creat en l'instant: " + printTimestamp);

		} catch (Exception e) {

			e.printStackTrace();

		}

		System.out.println("Creació d'un video:");
		System.out.println("Introdueix el nom de l'usuari:");
		name = sc.nextLine();
		System.out.println("Introdueix el cognom de l'usuari:");
		surname = sc.nextLine();
		System.out.println("Introdueix el password de l'usuari:");
		password = sc.nextLine();

		System.out.println("Quin és el títol del video:");
		String title = sc.nextLine();
		System.out.println("Quin és el url del video:");
		String url = sc.nextLine();
		System.out.println("Quin tag té el video:");
		String tag = sc.nextLine();

		try {

			controller.addVideo(name, surname, password, title);

			controller.updateUrlVideo(name, surname, password, title, url);
			controller.addTag(name, surname, password, title, tag);
			String printName = controller.getUser(name, surname, password).getName();
			String printSurname = controller.getUser(name, surname, password).getSurname();
			String allTitles = controller.getAllVideos(printName, printSurname, password);

			System.out.print("L'usuari " + printName + printSurname + " disposa dels videos: " + allTitles);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
