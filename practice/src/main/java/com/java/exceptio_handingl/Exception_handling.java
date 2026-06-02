package com.java.exceptio_handingl;

import java.util.Scanner;

public class Exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			try {
				
			if(i==5)
			{
				Scanner s=new Scanner(System.in);
			
				i=i/0; // infinity   // risk code
			}
			
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println(i);
		}
		
	
		
	}

}
