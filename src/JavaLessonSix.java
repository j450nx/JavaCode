//java.lang.RunTimeException
//java.lang.Exception
//ArithmeticException
//ClassNotFoundException
//IllegalArgumentException
//IndexOutOfBoundsExceptions
//InputMismatchException
//IOException

//import java.util.*;
import java.io.*;
public class JavaLessonSix{
	
//	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		divideByZero(2);
		
//		System.out.println("How old are you?");
//		int age = checkValidAge();
//		if (age != 0) {
//			System.out.println("You are " + age + " years old");
//		}
		
//		getAFile("./somestuff.txt");
		
		try {
			getAnotherFile("./somestuff.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Unknown IO Error");
		}
	}
	
	public static void getAnotherFile(String fileName) throws IOException, FileNotFoundException {
		FileInputStream file = new FileInputStream(fileName);
	}
	
	public static void getAFile(String fileName){
		try {
		FileInputStream file = new FileInputStream(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("Sorry can't fine that file");
		} catch (IOException e) {
			System.out.println("Unknown IO Error");
		} catch (Exception e) {
			System.out.println("Some error occured");
		} finally {
			System.out.println("Always called");
		}
		// to ignore an exception
		//catch (ClassNotFoundException e) {} 
	}
	
//	public static int checkValidAge() {
//		try {
//			return userInput.nextInt();
//		} catch (InputMismatchException e) {
//			userInput.next();
//			System.out.println("That isn't a whole number");
//			return 0;
//		}
//	}
	
	public static void divideByZero(int i) {
		try {
			System.out.println(i/0);
		} catch (ArithmeticException e) {
			System.out.println("You can't do that");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
}