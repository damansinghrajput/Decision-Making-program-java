package test.com;

import java.util.Scanner;

public class switchCaseProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Number1");
		int number1 = input.nextInt();

		System.out.println("Enter The Number2");
		int number2 = input.nextInt();

		

		System.out.println();

		System.out.println("1-Add");
		System.out.println("2-Subract");
		System.out.println("3-Mutiply");
		System.out.println("4-Divide");

		System.out.println("Chosse Operation:");
		
		int number3 = input.nextInt();

		switchCase(number1, number2, number3);
	}

	private static void switchCase(int number1, int number2, int number3) {
		switch (number3 ) {

			
		case 1 :	System.out.println("result"+(number1 + number2));
		break;
		case 2 :	System.out.println("result"+(number1 - number2));
		break;
		case 3 :	System.out.println("result"+(number1 * number2));
		break;
		case 4 :	System.out.println("result"+(number1 / number2));
		break;
		default :	System.out.println("Invaild Operation");

		}
		
		

	}

}
