package java_practice;

public class WhileCounter {

	public static void main(String[] args) {
		//int counter = 1;

		//while (counter <= 10){
		 //System.out.printf("%d  ", counter);
		   //++counter;
		  //System.out.println();

		//}
		//int counter = 1;

		//for (int Counter = 1;counter  <= 10;counter++)
		//System.out.printf("%d ", counter);
		//System.out.println();

		int total = 0;

		for(int number = 2; number <= 20; total += number, number +=2);
		 // total += number;
		    

		 System.out.printf("Sum is %d\n", total);

	}

}
