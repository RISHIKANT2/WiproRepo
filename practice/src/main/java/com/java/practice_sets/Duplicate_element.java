package com.java.practice_sets;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate_element {

	public ArrayList<Integer> Duplicate_Element(int[] arr) {
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr1.add(arr[i]);
					
				}
			}
		}
		return arr1;
	}
	public ArrayList<String> Duplicate_String_Element(String[] arr) {
		ArrayList<String> arr1=new ArrayList<String>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr1.add(arr[i]);
					
				}
			}
		}
		return arr1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duplicate_element d=new Duplicate_element();
		int[] arr= {1,2,2,3,4,5,5,6};
		String[] arr1= {"Apple","Banana","Chiku","Banana","Pineaplle","Apple"};
		System.out.println("The Duplicate Elements of the array are : "+d.Duplicate_Element(arr));
		System.out.println("The Duplicate Elements of the String array are : "+d.Duplicate_String_Element(arr1));
	}

}
