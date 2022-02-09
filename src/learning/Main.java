package learning;

import java.util.Scanner;

public class Main {
	Scanner scanner = new Scanner(System.in);

	public void checkPalindrome() {

		int remainder = 0;
		int sum = 0;
		int temp;
		int number = scanner.nextInt();
		temp = number;

		while (number > 0) {
			remainder = number % 10;
			sum = (sum * 10) + remainder;
			number = number / 10;
		}

		if (temp == sum) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not palindrome");
		}

	}

	public void printPattern() {
		int patternLength = scanner.nextInt();
		for (int i = patternLength - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + "");
			}
			System.out.println();
		}
	}

	public void checkPrimeNumber() {
		int number = scanner.nextInt();
		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}

	}

	public void printFibonacciSeries() {
		int number = scanner.nextInt();
		int firstNumber = 0;
		int secondNumber = 1;
		int i = 1;
		while (i <= number) {
			System.out.print(firstNumber + ",");
			int nextNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
			i++;
		}
	}

	public static void main(String args[]) {
		Main obj = new Main();
		int choice;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {
			case 0:
				choice = 0;
				break;
			case 1:
				obj.checkPalindrome();
				break;
			case 2:
				obj.printPattern();
				break;
			case 3:
				obj.checkPrimeNumber();
				break;
			case 4:
				obj.printFibonacciSeries();
				break;
			default:
				System.out.println("Invalid choice. Enter a valid no.\n");
			}

		} while (choice != 0);
		System.out.println("Exited Successfully!!!");

		sc.close();
	}
}
