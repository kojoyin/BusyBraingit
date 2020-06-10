package java_practice;

import java.rmi.AlreadyBoundException;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Errordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		// public class ErrorDemo{
		  //public static void main(String[] args){
		   int choice = 0;

		   Scanner input = new Scanner(System.in);

		  int[] numbers = {10,11,12,13,14,15};
		  System.out.print("Please enter the index of the array:");
          try
		     {
		           choice = input.nextInt();
		           if(choice == 1)
		           System.out.printf("numbers[%d] = %d%n",choice,numbers[choice]);
		     
		     } 
		           catch (ArrayIndexOutOfBoundsException e)
		     {
		           System.out.println("Error: Index is Valid.");
		     
		      }
		           catch (InputMismatchException e)
		     {
		           System.out.println("Error: You did not enter an integer.");
		     }
		          catch (Exception e)
		      {
		          System.out.printf(e.getMessage());
		      }     

		 }
		
		


	}


