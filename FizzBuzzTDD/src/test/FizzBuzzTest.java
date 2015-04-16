package test;

import static org.junit.Assert.*;
import main.FizzBuzz;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz;

	@Before
	public void setUp() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void whenFizzBuzzIsPassedANumberItReturnsThatNumber() {
		assertEquals("1", fizzBuzz.fizz(1));
	}

	@Test
	public void whenFizzBuzzIsPassedATwoItReturnsaTwo() {
		assertEquals("2", fizzBuzz.fizz(2));
	}

	@Test
	public void whenFizzBuzzIsPassedAThreeSayFizz() {
		assertEquals("Fizz", fizzBuzz.fizz(3));

	}

	@Test
	public void whenFizzBuzzIsPassedAnyMultipleOfThreeSayFizz() {
		assertEquals("Fizz", fizzBuzz.fizz(6));
		assertEquals("Fizz", fizzBuzz.fizz(9));

	}



}
