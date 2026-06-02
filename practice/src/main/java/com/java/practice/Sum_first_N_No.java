package com.java.practice;

import java.util.Scanner;

public class Sum_first_N_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);	
       System.out.println("Enter the no you want to find the first sum of :");
       int no= sc.nextInt();
       int sum=0;
       for(int i=no;i>=0;i--) {
    	   sum+=i;
       }
       System.out.println("The sum of first "+no+" "+"is :"+sum);
	}
       
}
