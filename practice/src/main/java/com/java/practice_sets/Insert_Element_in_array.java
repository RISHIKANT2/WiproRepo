package com.java.practice_sets;

import java.util.Arrays;

public class Insert_Element_in_array {
	
	public int[]Insert_in_array(int[] arr,int k,int n){
		Arrays.fill(arr, k,k+1,n);
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert_Element_in_array i=new Insert_Element_in_array();
		int[] arr1= {1,2,3,4,5};
		int k=3;
		int n=8;
		System.out.println("The new Inserted array :"+Arrays.toString(i.Insert_in_array(arr1, k, n)));
     
	}

}
