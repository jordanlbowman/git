//Assignment 3
//Jordan Bowman
//CS-110, Fall 2015

package second_project;

import java.util.*; //importing util library for use in program
import java.text.*; //importing text library for use in program
import javax.swing.JOptionPane; //importing JOptionPane for use in program

public class assignment2 {
	
	//starts main Java application
	public static void main(String[] args) {
		
		//create a Scanner to obtain user input from the console
		Scanner input = new Scanner(System.in);
			
		//create a Date to allow program to get current date/time
		//adapted from http://www.tutorialpoints.com/java/java_date_time.htm
		Date dNow = new Date( );
		SimpleDateFormat ft =
		new SimpleDateFormat ("EEEEEEEE MMMMMMM dd, yyyy hh:mm:sss a z");
		
			//help from http://stackoverflow.com/questions/10924561/java-scanner-string-input-if-statement-not-working
			String password; //make string called password
			System.out.println("Program start\nRunning " +ft.format(dNow)); //print line with date/time in console
			System.out.print("Enter password: "); //print line in console
			password = input.nextLine(); //take input for String: password with Scanner: input
			
			if(password.equalsIgnoreCase("doit")) { //continues to time sheet calculator if "doit" is inputed
				System.out.println("Welcome"); //print line in console
				
				String name = JOptionPane.showInputDialog("What's your name?"); //creates JOptionPane with text field for your name
				JOptionPane.showMessageDialog(null, "Hello " + name); //says hello ______ 
				
				int a = JOptionPane.showConfirmDialog(null, "Do you have a job?", //creates JOptionPane with Yes/No buttons
						 "Do you have a job?", JOptionPane.YES_NO_OPTION);
				
				if(a == JOptionPane.YES_OPTION){
				String base_pay =
						JOptionPane.showInputDialog("Regular Pay (per hour):"); //creates JOptionPane with text field for your base pay
				String hours_worked =
						JOptionPane.showInputDialog("Hours Worked:"); //creates JOptionPane with text field for the amount of hours worked
				double base = Double.parseDouble(base_pay); //makes String base_pay in to a double called base
				double hours = Double.parseDouble(hours_worked); //makes String hours_worked in to a double called hours
				
				//creating two doubles for overtime rate and double time rate
				double overtime;
				double doubletime;
				overtime = base * 1.5; //setting overtime as 1.5 times the base rate
				doubletime = base * 2; //setting double time as 2 times the base rate
				double pay = 0; //making and initializing a double called pay
				
				if (hours <= 8){ //8 hours and less use this equation to calculate pay
					pay = base * hours;
				}
				
				else if (hours > 8 && hours <= 12){ //Between 8+ hours and 12 hours use this equation to calculate pay
					double o_hours;
					o_hours = hours - 8; //calculating how many hours are to be paid at the overtime rate 
					pay = (base * 8) + (overtime * o_hours);
				}
				
				else if (hours > 12){ //12 hours and more use this equation to calculate pay
					double double_hours;
					double_hours = hours - 12; //calculating how many hours are to be paid at the double time rate
					pay = (base * 8) + (overtime * 4) + (doubletime * double_hours);
				}
				
				System.out.println("You made $" + pay); //printing line that tells user pay for designated hours worked 
				
		}
				else{
					int ag;
					do { //help from https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
						String age = JOptionPane.showInputDialog("How old are you?");
						ag = Integer.parseInt(age); //makes String an int for age
					} while (ag > 100); //does not allow ages over 100 years old 
					
					String title; //create string called title
					//help from https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
					switch (ag) {
		            case 10:  title = "Double Digit Midgit eh?";
		                     break;
		            case 18: title = "You aren't a real adult until you have a Costco card.";
		            		 break;
		            case 21:  title = "Vegas anyone?";
		                     break;
		            case 50:  title = "Oh my.";
		                     break;
		            default: title = "You're just like that other guy that just passed through here.";
		            		 break;
					}
					JOptionPane.showMessageDialog(null, title); //opens a JOptionPane with some saucy output for your age 
						
				}
				}
		else if (password != "doit"){ //runs if user input is anything but "doit"
				System.out.println("Wrong."); //print line that says "Wrong."
		}
	
		input.close(); //closes scanner

			}
	}
			