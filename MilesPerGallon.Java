import java.util.Scanner;

public class MilesPerGallon {
	  public static void main (String[] args ){
			 
		  // String Name 
		  int milesdriven;
		  int gas;
			
		  // Scanner To Read Input
		  @SuppressWarnings("resource")
		  Scanner keyboard = new Scanner (System.in);
		  
		  // Get the amount of Miles Driven
		  System.out.println("How many miles did you drive?");
		  milesdriven = keyboard.nextInt();
		  
		  // Get the amount of Gallons of gas used
		  System.out.println("How many gallons of gas did you use?");
		  gas = keyboard.nextInt();
		  
		  // Calculate Miles Per Gallon
		  System.out.println(milesdriven/gas);
	  }
}
