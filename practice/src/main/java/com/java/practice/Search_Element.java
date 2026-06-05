package com.java.practice;

public class Search_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int no=4;
        int arr1[]= {1,2,5,8,4,12,24};
        for(int i=0;i<arr1.length;i++) {
        	if(arr1[i]==no) {
        		System.out.println("The no is at index :"+i);
        		break;
        	}
        }
	} 

}
