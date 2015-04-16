package main;

public class FizzBuzz {

	public String fizz(Integer inputNumber) {
		if (inputNumber % 3 == 0) {
			return "Fizz";
		}

		return inputNumber.toString();
	}

}
