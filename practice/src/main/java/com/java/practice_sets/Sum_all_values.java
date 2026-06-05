package com.java.practice_sets;

public class Sum_all_values {

	public int array_sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr1= {1,2,3,4,5,6};
     Sum_all_values sc=new Sum_all_values();
     System.out.println(sc.array_sum(arr1));
	}

}
