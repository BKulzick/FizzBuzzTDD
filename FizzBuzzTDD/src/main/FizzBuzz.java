package main;

public class FizzBuzz {

	public String fizz(Integer inputNumber) {

		if ((inputNumber % 3 == 0) && (inputNumber % 5 == 0)) {
			return "FizzBuzz";
		} else if (inputNumber % 3 == 0) {
			return "Fizz";
		} else if (inputNumber % 5 == 0) {
			return "Buzz";
		}

		return inputNumber.toString();
	}

	public Integer checkInput(String choice) {
		Integer inputNumber = 0;
		try {
			inputNumber = inputNumber.parseInt(choice);

		} catch (NumberFormatException nfe) {
			System.out.println("Please input a Number.");
			return -1;
		}

		if (inputNumber >= 0)
			return inputNumber;
		else{
			System.out.println("Please input a positive Number");
			return -1;
		}
	}
}
