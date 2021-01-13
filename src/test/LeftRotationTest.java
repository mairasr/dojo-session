package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.LeftRotation;

public class LeftRotationTest {
	
	@Test
	public void test00() {
		int[] a = {13,15,17,19};
		int[] b = {15,17,19,13};
		Assertions.assertArrayEquals(b, LeftRotation.rotLeft(a,1));
	}
	
	@Test
	public void test02() {
		int[] a = {13,15,17,19};
		int[] b = {17,19,13,15};
		Assertions.assertArrayEquals(b, LeftRotation.rotLeft(a,2));
	}
	
	@Test
	public void test03() {
		int[] a = {13,15,17,19};
		int[] b = {19,13,15,17};
		Assertions.assertArrayEquals(b, LeftRotation.rotLeft(a,3));
	}
	
	@Test
	public void test04() {
		int[] a = {11,13,15,17,19};
		int[] b = {19,11,13,15,17};
		Assertions.assertArrayEquals(b, LeftRotation.rotLeft(a,4));
	}
	
	@Test
	public void test0() {
		int[] a = {11,13,15,17,19};
		int[] b = {19,11,13,15,17};
		Assertions.assertArrayEquals(b, LeftRotation.rotLeft(a,14));
	}
	
	@Test
	public void test05() {
		int[] a = {};
		Assertions.assertArrayEquals(a, LeftRotation.rotLeft(a,1));
	}
	
	@Test
	public void test06() {
		int[] a = {};
		Assertions.assertArrayEquals(a, LeftRotation.rotLeft(a,0));
	}
	
	
}
