package com.java.practice;

import java.util.Scanner;

public class Largest_of_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the three no to find largest of :");
       int num1= sc.nextInt();
       int num2= sc.nextInt();
       int num3= sc.nextInt();
       if(num1 >= num2 && num1 >= num3) {
           System.out.println(num1 + " is the largest.");
       } else if (num2 >= num1 && num2 >= num3) {
           System.out.println(num2 + " is the largest.");
       } else {
           System.out.println(num3 + " is the largest.");
       }
	}

}
