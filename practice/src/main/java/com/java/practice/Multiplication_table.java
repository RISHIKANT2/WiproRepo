package com.java.practice;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no you want the table of :");
        int no= sc.nextInt();
        for(int i=1;i<=10;i++) {
        	int prod= no*i;
        	System.out.println(no+"*"+i+"="+prod);
        }
	}

}
