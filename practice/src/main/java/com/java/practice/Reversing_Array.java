package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Reversing_Array {

	public ArrayList<Integer> reversed_array(int[] arr) {
		int size= arr.length;
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
	       for(int i=size-1;i>=0;i--) {
	    	   arr2.add(arr[i]);
	       }
	       return arr2;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reversing_Array rev=new Reversing_Array();
		
	}

}
