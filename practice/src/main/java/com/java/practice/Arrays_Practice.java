package com.java.practice;

public class Arrays_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		System.out.println("The elements in array are");
		for(int i=0; i<arr1.length;i++) {
		 System.out.print(arr1[i]+" ");
		}
		System.out.println();
		int sum=0;
		for(int i=0; i<arr1.length;i++) {
			 sum+= i;
		}
		System.out.println("The Sum of the array is :"+sum);

	}

}
