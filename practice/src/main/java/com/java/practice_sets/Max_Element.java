package com.java.practice_sets;

public class Max_Element {

	public int Max_Element(int[] arr) {
		int len=arr.length;
		int max_num=arr[0];
		for(int i=0;i<len;i++) {
			if(max_num<arr[i]) {
				max_num=arr[i];
			}
		}
		return max_num;
	}
	public int Min_Element(int[] arr) {
		int len=arr.length;
		int min_num=arr[0];
		for(int i=0;i<len;i++) {
			if(min_num>arr[i]) {
				min_num=arr[i];
			}
		}
		return min_num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max_Element mx=new Max_Element();
		int[] arr= {1,2,3,4,5,6,7};
		System.out.println("The maximum element is: "+mx.Max_Element(arr));
		System.out.println("The minimum element is: "+mx.Min_Element(arr));
		
	}

}
