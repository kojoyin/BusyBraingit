package java_practice;

import java.util.Scanner;



public class Control{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Grade");
		int StudentGrade = obj.nextInt(); 
	   
	
	
       if(StudentGrade == 90) 
    	   System.out.println("A");
       else 
    	   if (StudentGrade == 80)
    		   System.out.println("B");
    	   else
    		   if (StudentGrade == 70)
    			   System.out.println("C");
    		   else 
    	    	   System.out.println("No Score");
       
    			   
    		   
       
	
	}		   
    	   
       	}


