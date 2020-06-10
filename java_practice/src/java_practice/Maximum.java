package java_practice;

import java.util.Scanner;


public class Maximum {

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
		 System.out.println("Enter three floating-point values seperated by spaces:");
		  
		  double num1 = obj.nextDouble();
		  double num2 = obj.nextDouble();
		  double num3 = obj.nextDouble();

		  double result = maximum( num1, num2, num3 );
		  System.out.println( "maximum is: " + result );
		}
		 
		 


		

public static double maximum(double x,double y,double z){
	 
	  double maximumValue = x;
			 
	  if ( y > maximumValue )
	      maximumValue = y;
				
				    
	  if ( z > maximumValue )
	     maximumValue = z;
				
				     
	     return maximumValue;
		
		
		   
	}	
		
		
		
	}
		
		
		
		


	
			 
		
		
	
	

		
			 
		
	


