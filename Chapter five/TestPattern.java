import java.util.Scanner;
public class TestPattern {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int numOfRows = 27;
		int numOfSpaces = numOfRows/2;
		int numOfStars = 1;
		int midPoint = numOfRows/2 + 1;
		for(int i=1; i<=numOfRows; i++) {
			for(int j = 1; j<=numOfSpaces; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=numOfStars; k++) {
				System.out.print("*");
			}
			if(i<midPoint) {
				numOfSpaces--;
				numOfStars +=2;
				}
			else {
				numOfSpaces ++;
				numOfStars -=2;
			}
			System.out.println();
		}
		

	}

}
