package com.java.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Payment_Gateway_aggregator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface PaymentGateway {
    boolean processPayment(double amount);
}

class Razorpay implements PaymentGateway{
	public boolean processPayment(double amount) {
		if(amount>100.0) {
			return false;
		}
		return true;
	}
}
class Stripe implements PaymentGateway{
	public boolean processPayment(double amount) {
		if(amount>10000.0) {
			return false;
		}
		return true;
	}
}
class PayPal implements PaymentGateway{
	public boolean processPayment(double amount) {
		if(amount>10000000.0) {
			return false;
		}
		return true;
	}
}
class Payment_aggregator{
	double amount;
	Payment_aggregator(double amount){
		this.amount=amount;
	}
	List <PaymentGateway> gateway_list= new ArrayList<PaymentGateway>();
	
	public void add_gateways(PaymentGateway gateway) {
		gateway_list.add(gateway);
	}
	public void gateway_aggregator() {
		for(PaymentGateway gateway:gateway_list) {
			if(gateway.processPayment(amount)==false) {
				continue;
			}else {
				System.out.println("The "+gateway+"");
				
			}
		}
		
	}
}