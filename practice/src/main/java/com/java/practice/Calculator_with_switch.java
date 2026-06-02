package com.java.practice;

import java.util.Scanner;

public class Calculator_with_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two no for calculation");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("The operation of this calculator are :");
		System.out.println("1.Multiply");
    	System.out.println("2.Add");
    	System.out.println("3.Subtract");
    	System.out.println("4.Divide");
    	System.out.println("5.Remainder");
        System.out.println("Enter the operation no you want to perform such as 1,2 etc");
         int choice =sc.nextInt();
         int result=0;
         switch(choice) {
         case 1:
        	 result= num1*num2;
        	 System.out.println("The Multiplication of the given nos are:"+result);
        	 break;
         case 2:
        	 result= num1+num2;
        	 System.out.println("The Addition of the given nos are:"+result);
        	 break;
         case 3:
        	 result= num1-num2;
        	 System.out.println("The Substraction of the given nos are:"+result);
        	 break;
         case 4:
        	 result= num1/num2;
        	 System.out.println("The Division of the given nos are:"+result);
        	 break;
         case 5:
        	 result= num1%num2;
        	 System.out.println("The Remainder of the given nos are:"+result); 
        	 break;
         default:
        	 System.out.println("The given operation no is not valid, Pls choose from the above operations");
         }
	}

}
