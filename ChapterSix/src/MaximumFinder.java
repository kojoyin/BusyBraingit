    import java.util.Scanner;
    //public class MaximumFinder {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fig. 6.3: MaximumFinder.java
		// Programmer-declared method maximum with three double parameters.
		 
		
		public class MaximumFinder
		 {
		 // obtain three floating-point values and locate the maximum value
		 public static void main( String[] args )
		 {
		 // create Scanner for input from command window
		 Scanner input = new Scanner( System.in );
		
		 // prompt for and input three floating-point values
		 System.out.print("Enter three floating-point values separated by spaces: " );
		 double number1 = input.nextDouble(); // read first double
		 double number2 = input.nextDouble(); // read second double
		 double number3 = input.nextDouble(); // read third double
		 
		  // determine the maximum value
		 double result = maximum( number1, number2, number3 );
		 
		 
		  // display maximum value
		  System.out.println("Maximum is: " + result);
		  } // end main
		 
		 
		// returns the maximum of its three double parameters
		 public static double maximum( double x, double y, double z )
		 {
		 double maximumValue = x; // assume x is the largest to start
		 
		 // determine whether y is greater than maximumValue
		 if ( y > maximumValue )
		 maximumValue = y;
		 
		 // determine whether z is greater than maximumValue
		 if ( z > maximumValue )
			 maximumValue = z;
			 return maximumValue;
			 } // end method maximum
		      // end class MaximumFinder
		 
		 
		 
		 }
		// Enter three floating-point values separated by spaces: 9.35 2.74 5.1
		 //Maximum is: 9.35
		 //Enter three floating-point values separated by spaces: 5.8 12.45 8.32
		 //Maximum is: 12.45
		 //Enter three floating-point values separated by spaces: 6.46 4.12 10.54
		 //Maximum is: 10.54
		 //Fig. 6.3 | Programmer-declared method maximum with three double parameters. (Part 2 of 2.)
		 
		 
		 // returns the maximum of its three double parameters
		 
		 
		 
	
		