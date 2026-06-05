package com.java.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Recerse_array {

	
	@Test
	public void ReverseTest() {
		Reversing_Array rev=new Reversing_Array();
		int[] arr1= {1,2,3,4,5};
		ArrayList<Integer> arr=rev.reversed_array(arr1);
		ArrayList<Integer> arr2= new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
		assertEquals(arr2,arr);
	}
}
