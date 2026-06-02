package com.java.practice_sets;

public class Find_a_value {
    public int find(int[] arr, int k) {
    	int index=0;
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]==k) {
    		  index=i;
    		}
    	}
    	return index;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_a_value s= new Find_a_value();
		int[] arr1= {2,3,4,6,3,8,9,12};
		int k=8;
		System.out.println("The Element is at the index "+s.find(arr1, k));
	}

}
