package age;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner userInput = new Scanner(System.in);	
		
		System.out.println("Enter your age");
		int age = userInput.nextInt();

		Age myAge = new Age(age);
		
		System.out.println(myAge.checkAge());
			
	}

}
