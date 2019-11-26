
package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Method cm = new Method();

		try(Scanner sc = new Scanner(System.in)) {		

		System.out.println("Enter first number: ");

		double first = sc.nextDouble();

		System.out.println("Enter Second number: ");

		double second = sc.nextDouble();

		System.out.println("Select methods: ");

	/*	System.out.println("1 : +"); 
	*/	System.out.println("2 : /");
	/*	System.out.println("3 : *");
		System.out.println("4 : -");
*/
		int choice = sc.nextInt();

		switch (choice) {

	/*	case 1:
			System.out.println(cm.Addition(first, second));
			break;

	*/	case 2:
			System.out.println(cm.Division(first, second));
			break;

	/*	case 3:
			System.out.println(cm.Multipication(first, second));
			break;

		case 4:
			System.out.println(cm.Subtraction(first, second));
			break;
	*/	}
		}

	}

}
