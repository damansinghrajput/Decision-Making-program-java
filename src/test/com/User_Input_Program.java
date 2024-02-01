package test.com;
import java.util.Scanner;


public class User_Input_Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Number1");
		int number1 = input.nextInt();

		System.out.println("Enter The Number2");
		int number2 = input.nextInt();

		// System.out.println("your number is print "+ number1 + number2);

		System.out.println();

		System.out.println("1-Add");
		System.out.println("2-Subract");
		System.out.println("3-Mutiply");
		System.out.println("4-Divide");

		System.out.println("Chosse Operation:");
		int number3 = input.nextInt();

		if (number3 == 1) {

			System.out.println(" Result is Add ");
			System.out.println(number1 + number2);

		}

		else if (number3 == 2) {

			System.out.println(" Result is Subract ");
			System.out.println(number1 - number2);

		} else if (number3 == 3) {

			System.out.println(" Result is Multiply ");
			System.out.println(number1 * number2);

		} else if (number3 == 4) {

			System.out.println(" Result is Divide ");
			System.out.println(number1 / number2);

		}

		else {

			System.out.println("Invaild Operation");

		}
	}

}
	
