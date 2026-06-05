package com.java.abstraction;

public class Banking_System {
     int amount;
      Banking_System(int amount){
    	 this.amount=amount;
      }
      public void Deposit(int sum) {
    	  amount+=sum;
    	  System.out.println("The total balance after deposit is :"+amount);
      }
      public void Credit(int sum) {
     	 amount=amount-sum;
     	System.out.println("The total balance after Credit is :"+amount);
       }
       public void Balance() {
     	 System.out.println("The current balance is :"+amount);
      }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Banking_System b= new Banking_System(1000);
         b.Balance();
         b.Deposit(500);
         b.Credit(200);
	}

}
