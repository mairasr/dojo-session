package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.BubbleSort;

public class BubbleSortTest {

	// 2 items
	@Test
	public void test00() {
		int[] arr = new int[] { 2, 1 };
		int[] expected = new int[] { 1, 2 };
		Assertions.assertArrayEquals(expected, BubbleSort.sort(arr));
	}

	// 3 items
	@Test
	public void test01() {
		int[] arr = new int[] { 3, 2, 1 };
		int[] expected = new int[] { 1, 2, 3 };
		Assertions.assertArrayEquals(expected, BubbleSort.sort(arr));
	}

	// 5 items
	@Test
	public void test02() {
		int[] arr = new int[] { 10, -5, 5, 1, 2 };
		int[] expected = new int[] { -5, 1, 2, 5, 10 };
		Assertions.assertArrayEquals(expected, BubbleSort.sort(arr));
	}

	// 7 items
	@Test
	public void test03() {
		int[] arr = new int[] { 10, 5, 2, 1, 3, -50, -10 };
		int[] expected = new int[] { -50, -10, 1, 2, 3, 5, 10 };
		Assertions.assertArrayEquals(expected, BubbleSort.sort(arr));
	}

}
