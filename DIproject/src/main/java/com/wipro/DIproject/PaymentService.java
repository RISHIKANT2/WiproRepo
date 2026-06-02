package com.wipro.DIproject;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
	
	String pay_method;
    public void pay() {
    	System.out.println("Payment done through: "+pay_method);
    }
    public void setPay(String pay_method) {
    	this.pay_method = pay_method;
    }
}
