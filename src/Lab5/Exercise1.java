package Lab5;

import java.util.Scanner;

class AgeException extends Exception {

	public AgeException(String message) {
		super(message);
	}
}

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		// Handling exception
		// try block
		try {
			if (age < 15)
				throw new AgeException(" invalid age,Age of a person should be above 15");
			else
				System.out.println("Age of person : " + age);
		}
		// catch block
		catch (AgeException e) {
			System.out.println(e);
		}

	}

}


