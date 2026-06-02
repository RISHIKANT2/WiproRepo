package com.java.abstraction;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Payment cd= new CreditCard();
        cd.pay();
        Payment upi= new UPI();
        upi.pay();
        Payment cs=new Cash();
        cs.pay();
	}

}
interface Payment{
	void pay();
}
class CreditCard implements Payment{
	public void pay() {
		System.out.println("Payment Doen through CreditCard");
	}
}
class UPI implements Payment{
	public void pay() {
		System.out.println("Payment Doen through UPI");
	}
}
class Cash implements Payment{
	public void pay() {
		System.out.println("Payment Doen through Cash");
	}
}