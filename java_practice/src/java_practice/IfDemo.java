package java_practice;
import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		
		
		  /* System.out.print("\nPlease enter your age: ");
		   int userAge = obj.nextInt();

		   if(userAge < 0 || userAge > 100){
		   System.out.println("Invalid Age");
		   System.out.println("Age must be between 0 and 100");
		   }

		   else if (userAge < 18)
		        System.out.println("Sorry you are underage");
		   else if (userAge < 21)
		        System.out.println("You need Parental Consent");
		   else {
		        System.out.println("Congratulations!");
		        System.out.println("You may Sing up for the event!");
		      }*/
		        
		    
		/*System.out.println("Enter Your Grade");
		 String userGrade = obj.nextLine().toUpperCase();

		 switch (userGrade){
		     case "A+":
		     case "A":
		           System.out.println("Distinction");
		           break;
		     case "B":
		           System.out.println("Brilliant");
		           break;
		      case "C":
		           System.out.println("Very Good");
		           break;
		      default:
		           System.out.println("Good");
		           break;
		         }*/
		
		//for(int i = 0; i < 10; i++) 
		//{
			//System.out.println();
			//System.out.print(i);
			//System.out.println();
		//}
		
		//int[] myNumbers = {10,20,30,40,50};
		
		 //for(int items : myNumbers) {
			// System.out.printf("%d  ",  items);
			 
		/*int counter = 5;
		while(counter > 0) {
			System.out.println("Counter = " + counter );
			counter = counter -1;
			//break;
		}*/
		
		/*int counter = 100;
		do {
			System.out.println("Counter =  "  + counter);
			counter ++;
		    break;
		}
		while(counter>0); {
		
		}*/
		
		/*for(int i = 0; i<5; i++){
	         System.out.println("i = " + i);
	         if(i == 2)
	          continue;
	         System.out.println("I will not Printed if i=2");
	        }*/
		
		
		    int num, deno;
	      
	        Scanner input = new Scanner(System.in);
	         try
	        {
	        System.out.println("Please enter the numerator:");
	        num = input.nextInt();
	 
	        System.out.println("Please enter the denominator:");
	        deno = input.nextInt();
	  
	        System.out.println("The result is " + num/deno);       
	        }
	        catch (Exception e)
	        {
	         System.out.println(e.getMessage());
	        }
	        finally
	        {
	         System.out.println("------------- End of Error--------- Handling Example ");
	         }
		     
	}


	}


