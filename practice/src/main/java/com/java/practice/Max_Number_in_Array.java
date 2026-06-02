package com.java.practice;

import java.util.Scanner;

public class Max_Number_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr1[]= new int[size];
        System.out.println("Enter the Elements of the array");
        for(int i=0; i<size;i++) {
        	arr1[i]= sc.nextInt();
        }
        System.out.println("The Elements of the array you enterd are");
        for(int i=0;i<arr1.length;i++) {
        	System.out.print(arr1[i]+" ");
        }
        System.out.println();
        int max_num= arr1[0];
        for(int i=0;i<arr1.length;i++) {
        	if(max_num<arr1[i]) {
        		max_num=arr1[i];
        	}
        }
        System.out.println("The maximum no in the given array is :"+max_num);
	}

}
