package com.java.practice_sets;

public class Array_Average {
	
	public float Average(int[] arr) {
		float len=arr.length;
		int sum=0;
		for(int i=0;i<len;i++) {
			sum+=arr[i];
		}
		float avg= (float)(sum/len);
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr1= {1,2,3,4,5,6};
         Array_Average a=new Array_Average();
         System.out.println(a.Average(arr1));
	}

}
