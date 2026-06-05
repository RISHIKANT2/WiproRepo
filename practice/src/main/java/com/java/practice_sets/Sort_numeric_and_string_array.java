package com.java.practice_sets;

import java.util.Arrays;

public class Sort_numeric_and_string_array {
       public int[] sort_arrays(int[] arr) {
    	   Arrays.sort(arr);
    	   return arr;
       }
       public String[] sort_String_arrays(String[] arr) {
    	   Arrays.sort(arr);
    	   return arr;
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr1= {1,3,5,2,6,7,3,8,9,32};
       String[] str= {"Apple","Banana","Cauliflower","Brinjal"};
       Sort_numeric_and_string_array s=new Sort_numeric_and_string_array();
       System.out.println(Arrays.toString(s.sort_arrays(arr1)));
       System.out.println(Arrays.toString(s.sort_String_arrays(str)));
       
	}

}
