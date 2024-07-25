package exceptionHandling;

import java.util.Scanner;



//Write a java program to create a custom exception class called AgeProblemException, Read the person age from the user, 
//and validate whether the person is able to cast the vote or not, 
//if person is a not able to cast the vote then throw AgeProblemException.
class AgeProblemException extends Exception {
	public String getMessage() { // inbuild method
		return "Person is not eligible :Age is not valid!!";
	}
}
class RTO {

	private int age;

	void acceptAge() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Age of Person: ");
		age = scan.nextInt();
		
	}

	void validateAge() throws AgeProblemException{
		if (age >= 18&&age <= 60) {
			System.out.println("Person is eligible");
		} else {
			AgeProblemException ae = new AgeProblemException();
			System.out.println(ae.getMessage());
			throw ae;
		}
	}

}
public class Program1 {

	public static void main(String[] args) {
		
			RTO r = new RTO();

			try {
				r.acceptAge();
				r.validateAge();

			} catch (Exception e) {

				
			}

	}

}
