package com.java.practice_sets;

import java.util.Arrays;

public class Copy_array {

	public int[] copy(int[] arr) {
		int []arr1= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		return arr1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy_array cp=new Copy_array();
		int[] arr= {1,2,3,4,5,6};
		System.out.println("The copied array is :"+Arrays.toString(cp.copy(arr)));
	}

}
