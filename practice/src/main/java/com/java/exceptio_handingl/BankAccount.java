package com.java.exceptio_handingl;

import java.util.Scanner;

public class BankAccount {
	static int balance;
	BankAccount(int balance){
		this.balance=balance;
	}
	public void checkBalance() throws InsufficientBalanceException {
		if(balance<1000) {
			throw new InsufficientBalanceException("The balance is not sufficient ,give balance above 1000");
		}else {
			System.out.println("The Balance is :"+balance);
		}
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the balance :");
        int balance=sc.nextInt();
        BankAccount b=new BankAccount(balance);
        try {
        	b.checkBalance( );
        	
        }catch(InsufficientBalanceException e) {
        	System.out.println("The Exception :"+e.getMessage());
        }
	}

}

class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}