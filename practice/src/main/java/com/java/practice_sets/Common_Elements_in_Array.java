package com.java.practice_sets;

import java.util.ArrayList;

public class Common_Elements_in_Array {

	public ArrayList<Integer> Common_Element(int[] arr1,int[] arr2){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		if(arr1.length<arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr1.length;j++) {
				if( arr1[i]==arr2[j]) {
					arr.add(arr1[i]);
				}
			 }
			}
		}else {
			for(int i=0;i<arr2.length;i++) {
				for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					arr.add(arr2[i]);
				}
			 }
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Common_Elements_in_Array c=new Common_Elements_in_Array();
		int[] arr1= {1,2,3,4,8,9,12};
		int[] arr2= {2,3,4,8};
		System.out.println("The Common in two arrays are :"+c.Common_Element(arr1, arr2));
	}

}
