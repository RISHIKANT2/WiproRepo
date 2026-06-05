package com.java.practice;

public class Even_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr1[]= {1,2,4,5,8,12};
       int count=0;
       for(int i=0;i<arr1.length;i++) {
    	   if(arr1[i]%2==0) {
    		  count++;  
    	   }
       }
       System.out.println("The no of Even no in array is :"+ count);
	}

}
