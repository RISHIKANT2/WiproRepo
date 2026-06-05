package com.java.arraylist;

import java.util.ArrayList;

public class Marks_calaculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> arr1= new ArrayList<>();
      arr1.add(98);
      arr1.add(85);
      arr1.add(96);
      arr1.add(90);
      int highest=arr1.get(0);
      for(Integer a:arr1) {
    	  if(highest<a) {
    		  highest=a;
    	  }
      }
      System.out.println("The highest value in the array is :"+highest);
      int smallest=arr1.get(0);
      for(Integer a:arr1) {
    	  if(smallest>a) {
    		  smallest=a;
    	  }
      }
      System.out.println("The smallest value in the array is :"+smallest);
      double avg=0;
      int sum=0;
      for(Integer e:arr1) {
    	  sum=sum+e;
      }
      
      avg= (double)(sum/arr1.size());
      System.out.println("The average value in the array is :"+avg);
	}

}
