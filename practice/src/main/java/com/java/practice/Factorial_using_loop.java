package com.java.practice;

import java.util.Scanner;

public class Factorial_using_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no you want to find Factorial of :");
        int no= sc.nextInt();
        int result= 1;
        for(int i=no; i>=1;i--) {
        	result= result*i; 
        }
        System.out.println("The Factorial of the no is :"+result);
	}

}
