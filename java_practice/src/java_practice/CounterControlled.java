import java.io.*;

package java_practice;

public class CounterControlled {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		 public static void main( String[] args ) {
		     System.out.println("WHILE:");
		     whileControlledRepetition();
		 
		     System.out.println("**************************");
		     System.out.println("FOR:");
		     forControlledRepetition();
		   }
		 
		   private static void whileControlledRepetition() {
		       int counter = 1; // declare and initialize the control variable
		       while ( counter <= 10 ) { // loop continuation condition
		         System.out.printf( "%d  ", counter );
		         ++counter; // control variable increment
		       }
		       System.out.println();
		    }
		 
		    private static void forControlledRepetition() {
		       int counter; // declare
		       for (counter = 1; counter <= 10; counter++ ) { // inizialize control variable; loop continuation condition; control variable increment;
		          System.out.printf( "%d  ", counter );
		       }
		       System.out.println();
		   }
		
		
		
		





		
		
	}

}
