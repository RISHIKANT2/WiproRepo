package com.java.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.java.practice1.Operations;

public class TestOperation {

	@Test
	public void addTest() {
		Operations o=new Operations();
		int result=o.add(3, 2);
		assertEquals(5,result);
	}
	@Test
	public void subtrractTest() {
		Operations o=new Operations();
		int result=o.subtract(4, 2);
		assertEquals(2,result);
	}
	@Test
	public void multiplyTest() {
		Operations o=new Operations();
		int result=o.multiply(4, 2);
		assertEquals(8,result);
	}
	@Test
	public void countTest() {
		Operations o=new Operations();
		int result=o.Count_vowels("watermelon");
		assertEquals(4,result);
	}
	@Test
	public void palindromeTest() {
		Operations o=new Operations();
		
		assertTrue(o.palindrome_check(121));
	}
	@Test
	public void EvenTest() {
		Operations o=new Operations();
		
		assertTrue(o.isEven(12));
	}
	
}
