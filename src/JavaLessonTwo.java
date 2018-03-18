import java.util.Scanner;

public class JavaLessonTwo{
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Your favourite number: ");
		
		if(userInput.hasNextInt()) {
			int numberEntered = userInput.nextInt();
			System.out.println("You have entered: " + numberEntered);
			
			int numEnteredTimes2 = numberEntered + numberEntered;
			System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);
			
			int numEnteredMinus2 = numberEntered - 2;
			System.out.println(numberEntered + " - 2 = " + numEnteredMinus2);
			
			int numEnteredTimesSelf = numberEntered * numberEntered;
			System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimesSelf);
			
			int numEnterDividedBy2 = numberEntered / 2;
			System.out.println(numberEntered + " / 2 = " + numEnterDividedBy2);
			
			int numEnteredRemainder = numberEntered % 2;
			System.out.println(numberEntered + " % 2 = " + numEnteredRemainder);
			
			numberEntered += 2;
			numberEntered -= 2;
			
			numberEntered --;
			numberEntered ++;
			
			int numberABS = Math.abs(numberEntered);
			int whichIsBigger = Math.max(5,  7); //7
			int whichIsSmaller = Math.min(5, 7); //5
			
			double numSqrt = Math.sqrt(5.23);
			System.out.println("Square root of 5.23: " + numSqrt);
			
			int numCeiling = (int) Math.ceil(5.23); //6
			
			int numberFloor = (int) Math.floor(5.23); //5
			
			int numRound = (int) Math.round(5.65); //6
			
			int randomNumber = (int) (Math.random()*11);
			System.out.println("Random number: " + randomNumber);
			
		} else {
			System.out.println("Enter an integer next time");
		}
	}
}