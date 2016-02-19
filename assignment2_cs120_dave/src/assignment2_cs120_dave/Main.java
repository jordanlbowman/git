package assignment2_cs120_dave;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//create a Date to allow program to get current date/time
		//adapted from http://www.tutorialpoints.com/java/java_date_time.htm
		Date dNow = new Date( );
		SimpleDateFormat ft =
		new SimpleDateFormat ("EEEEEEEE MMMMMMM dd, yyyy h:mm:ss a z");
		System.out.println("Program start\nRunning " + ft.format(dNow) + "\n"); //print line with date/time in console

		Colleges[] colleges = new Colleges[3];
				colleges[0] = new Colleges("Private"); 
				colleges[1] = new Colleges("Public");
				colleges[2] = new Colleges("For Profit");
				
		Object[] your_colleges = new Object [4];
		your_colleges[0] = new Carroll_College();
		your_colleges[1] = new USC();
		your_colleges[2] = new Hawaii();
		your_colleges[3] = new Grand_Canyon();
		
		String[] your_college = new String [4];
		your_college[0] = "Carroll_College";
		your_college[1] = "USC";
		your_college[2] = "Hawaii";
		your_college[3] = "Grand_Canyon";
				 
		String yours = (String) JOptionPane.showInputDialog(null, "What do you want:",
						 "Pick one", JOptionPane.QUESTION_MESSAGE, null, your_college, your_college[0]); 
		
		System.out.println(yours.getClass());
		//yours.getS();
		//yours.getC();
		//yours.getF();
		
	}

}
