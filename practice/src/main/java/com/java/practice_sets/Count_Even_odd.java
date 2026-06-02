package com.java.practice_sets;

public class Count_Even_odd {
	
	public int count_even(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
			}else {
				continue;
			}
		}
		return count;
	}
	public int count_odd(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				continue;
			}else {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_Even_odd c=new Count_Even_odd() ;
		int[] arr1= {1,2,3,4,5,6,8};
	    System.out.println("The no of even is: "+c.count_even(arr1));
	    System.out.println("The no of odd is: "+c.count_odd(arr1));
	}

}
