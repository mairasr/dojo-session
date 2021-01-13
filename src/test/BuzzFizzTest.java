package test;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.BuzzFizzImpl;

public class BuzzFizzTest {

	@Test
	public void test00() {
		List<String> expected = List.of("1", "2", "FIZZ", "4", "BUZZ");
		Assertions.assertEquals(expected, BuzzFizzImpl.range(1, 5));
	}

    @Test
    public void test01() {
        List<String> expected = List.of("BUZZ", "11", "FIZZ", "FIZZ","14", "FIZZBUZZ");
        Assertions.assertEquals(expected, BuzzFizzImpl.range(10, 15));
    }

 

    @Test
    public void test02() {
        List<String> expected = List.of("BUZZ", "FIZZ", "97", "98", "FIZZ", "BUZZ");
        Assertions.assertEquals(expected, BuzzFizzImpl.range(95, 100));
    }
    
    @Test
    public void test03() {
        List<String> expected = List.of("29", "FIZZBUZZ", "FIZZ", "=","=","=","FIZZBUZZ","FIZZ","=","=","=","BUZZ", "41");
        Assertions.assertEquals(expected, BuzzFizzImpl.range(29, 41));
    }
    
    @Test
    public void test04() {
       List<String> expected = List.of("49", "BUZZ", "FIZZBUZZ", "BUZZ", "FIZZBUZZ", "=", "BUZZ", "=",
               "FIZZBUZZ", "BUZZ", "=", "FIZZBUZZ", "61");
       Assertions.assertEquals(expected, BuzzFizzImpl.range(49, 61));
    }
}
