package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.XmasTree;

public class TreeTest {

	@Test
	public void test1() {
		Integer[] a = new Integer[] {13,15,17,19};
		Assertions.assertArrayEquals(a, XmasTree.xmastree(9));
		
	}
}
