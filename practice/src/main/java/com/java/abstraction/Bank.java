package com.java.abstraction;

public class Bank {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_work b=new transactions(1000);
		b.show_balance();
		b.deposit_money(500);
		b.credit_money(200);
	}

}
interface Bank_work{
	void deposit_money(int sum);
	void credit_money(int sum);
	void show_balance();
}

class transactions implements Bank_work{
	int amount;
	transactions(int sum){
		this.amount=sum;
	}
	public void deposit_money(int sum) {
		amount+=sum;
  	  System.out.println("The total balance after deposit is :"+amount);
	}
	public void credit_money(int sum) {
		amount=amount-sum;
     	System.out.println("The total balance after Credit is :"+amount);
	}
	public void show_balance() {
		System.out.println("The current balance is :"+amount);
	}
}