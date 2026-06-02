package com.java.practice;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        boolean choices=false;
        do {
        	System.out.println("Enter the Two nos for Calculation");
        	int num1=sc.nextInt();
        	int num2=sc.nextInt();
        	System.out.println("These are some of the operations");
        	System.out.println("1.Multiply");
        	System.out.println("2.Add");
        	System.out.println("3.Subtract");
        	System.out.println("4.Divide");
        	System.out.println("Enter you operation nos such as 1, 2, etc");
        	int operation= sc.nextInt();
        	if(operation==1) {
        		int result=num1*num2;
        		System.out.println("The multiplication of two numbers is :"+result);
        	}else if(operation==2) {
        		int result=num1+num2;
        		System.out.println("The Addition of two numbers is :"+result);
        	}else if(operation==3) {
        		int result=num1-num2;
        		System.out.println("The Substraction of two numbers is :"+result);
        	}else if(operation==4) {
        		int result=num1/num2;
        		System.out.println("The Division of two numbers is :"+result);
        	}else {
        		System.out.println("You have entered invalid operation choice");
        	}
        	System.out.println("Do you want to continue then enter true else false");
        	choices=sc.nextBoolean();
        }while(choices);
    }
}
