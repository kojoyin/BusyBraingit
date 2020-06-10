 public class Calculator{  // things expected in a class are variables,methods.
			  
			 
			  
			  int num1;
			  int num2;
			  int result;
			  
			  public void operation()   // A METHOD MUST HAVE CURLY BRACES:
			   { 
			    result = num1 + num2;
			   }
			 			  
		
     public static void main(String[] args) {// Execution is done sequentially, so the first line that executed is the main funtion:
             //Things expected in main Fuction are invocation,creation of an object: 
             // once an object is created it will automatically load variables,methods etc to the memory at the backend	  
		  

         Calculator obj = new Calculator(); // objects knows something and it does something too.
         obj.num1 =40;
         obj.num2 =1000;
         
         
         obj.operation();
         System.out.println(obj.result);

		  
		  
		  }
		  








	}


