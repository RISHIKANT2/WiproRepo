package com.java.practice_sets;

import java.util.Arrays;

public class Array_Reverse {

	
	public int[] reverse(int[] arr) {
		int[] arr1= new int[arr.length];
		int len=arr1.length-1;
		for(int i=arr1.length-1;i>=0;i--) {
			arr1[len-i]= arr[i];
		}
		return arr1;
	}
	
	public static void main(String args[]) {
		Array_Reverse ar=new Array_Reverse() ;
			int[] arr= {1,2,3,4,5};
		    System.out.println("The reversed Array is :"+Arrays.toString(ar.reverse(arr)));
		
	}
}
