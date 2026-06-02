package com.wipro.DIproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
	@Autowired
	 PaymentService pay_choice;
	
    String order_category;
	
	public void order() {
		System.out.println("Order Placed for: "+order_category);
		pay_choice.pay();
	}
	public void setPayment(String pay_method) {
		pay_choice.setPay(pay_method);
	}
	public void setOrder(String order_category) {
		this.order_category=order_category;
	}
	
}
