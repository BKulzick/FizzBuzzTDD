package main;

public class FizzBuzz {

	public String fizz(Integer inputNumber) {
		if (inputNumber % 3 == 0) {
			return "Fizz";
		} else if (inputNumber % 5 == 0) {
			return "Buzz";
		}

		return inputNumber.toString();
	}

}
