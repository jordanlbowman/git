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
				
		Object[] your_colleges = new Object [2];
		your_colleges[0] = new USC();
		your_colleges[1] = new Hawaii();
				 
		String moneys = JOptionPane.showInputDialog(null, "How much money do you have?");
		String money = JOptionPane.showInputDialog(null, "How much money do you have for Hawaii?");

		try{
			((USC) your_colleges[0]).setC(Integer.parseInt(moneys));
		}
		catch(NumberFormatException e){
			System.out.println("That's not an integer");
			System.exit(0);
		}
		try{
			((Hawaii) your_colleges[1]).setC(Integer.parseInt(money));
		}
		catch(NumberFormatException e){
			System.out.println("That's not an integer for Hawaii money");
			System.exit(0);
		}

	}

}
