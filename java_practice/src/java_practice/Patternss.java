
import java.io.*;

package java_practice;

//public class Patternss {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

//public class Patternss{

//public static void main(String[] args){

// for(int i= 1; i<=7; i++){
 
  //  if(i==1 || i==7){
    //  for(int j= 1; j<=7; j++)
      //  System.out.print("*");
//}

 //else{
   //System.out.print("*");
   //System.out.print(" ");
   //System.out.print(" ");
   //System.out.print(" ");
   //System.out.print(" ");
   //System.out.print(" ");
   //System.out.print("*");
 //}
 
   // System.out.println();

//}
		/*for(int i=1; i<=5; i++){
			
			for(int k=1; k<=4; k++) { 
				
				for(int j=1; j<=3; j++) 
					
					System.out.print("*");
				System.out.println();
			}
			System.out.println();		
				
		 }*/

         // for(int j=1; j<=10; j++) {
           //for(int i=1; i<=5; i++) {
        	 //  System.out.print("*");
        //   }
          //}
		
		
		
		
		 
		public class CounterControlledRepetition {
		 
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

}











