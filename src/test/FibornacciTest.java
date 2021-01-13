package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.Fibornacci;

public class FibornacciTest {

	@Test
	public void test00() {
		int n = 1;
		int expected = 1;
		Assertions.assertEquals(expected, Fibornacci.fib(n));
	}

	@Test
	public void test02() {
		int n = 2;
		int expected = 1;
		Assertions.assertEquals(expected, Fibornacci.fib(n));
	}
	
	@Test
	public void test03() {
		int n = 3;
		int expected = 2;
		Assertions.assertEquals(expected, Fibornacci.fib(n));
	}
	
	@Test
	public void test04() {
		int n = 4;
		int expected = 3;
		Assertions.assertEquals(expected, Fibornacci.fib(n));
	}
	
	@Test
	public void test05() {
		int n = 5;
		int expected = 5;
		Assertions.assertEquals(expected, Fibornacci.fib(n));
	}

}
