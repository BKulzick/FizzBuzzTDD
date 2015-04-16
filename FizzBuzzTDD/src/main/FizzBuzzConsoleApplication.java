package main;

import java.util.Scanner;

public class FizzBuzzConsoleApplication {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		FizzBuzz fizzBuzz = new FizzBuzz();
		Integer inputNumber = 0;

		do {

			System.out.println("What Number would you like to count up to?");

			String choice = input.nextLine();

			inputNumber = fizzBuzz.checkInput(choice);

			if (inputNumber > 0) {
				for (int i = 1; i <= inputNumber; i++) {
					System.out.println(fizzBuzz.fizz(i));
				}

				System.out
						.println("Enter '1' to go again or anything else to quit");

				choice = input.nextLine();
				if (choice.equals("1"))
					inputNumber=-1;
				else{
					break;
				}
				

			}

		} while (inputNumber == -1);
	}

}
