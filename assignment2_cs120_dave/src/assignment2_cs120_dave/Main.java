package assignment2_cs120_dave;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//create a Date to allow program to get current date/time
		//adapted from http://www.tutorialpoints.com/java/java_date_time.htm
		Date dNow = new Date( );
		SimpleDateFormat ft =
		new SimpleDateFormat ("EEEEEEEE MMMMMMM dd, yyyy h:mm:ss a z");
		System.out.println("Program start\nRunning " + ft.format(dNow) + "\n"); //print line with date/time in console
		//Colleges.colleges();
		
	}

}
