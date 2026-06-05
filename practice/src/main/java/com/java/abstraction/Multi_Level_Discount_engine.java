package com.java.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Multi_Level_Discount_engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price=5000;
		Discount_Manager dm= new Discount_Manager(price);
		dm.add_Discounts(new SeasonalDiscount());
		dm.add_Discounts(new LoyaltyDiscount());
		dm.add_Discounts(new BulkDiscount());
		price=dm.apply_all_discounts();
		System.out.println("The Discounted Price is :"+price);
	}

}

interface Discounts{
	double apply(double price);
}

class SeasonalDiscount implements Discounts{
	
	public double apply(double price) {
		 price = (double)(price-(price*10/100.0));
		return price;
	}
}
class LoyaltyDiscount implements Discounts{
	
	public double apply(double price) {
		 price = (double)(price-(price*15/100.0));
		return price;
	}
}
class BulkDiscount implements Discounts{
	
	public double apply(double price) {
		 price = (double)(price-(price*5/100.0));
		return price;
	}
}
class Discount_Manager{
	double price;
	Discount_Manager(double price){
		this.price=price;
	}
	private List<Discounts> discount_list= new ArrayList<Discounts>();
	
	public void add_Discounts(Discounts discount) {
		discount_list.add(discount);
	}
	public double apply_all_discounts() {
		for(Discounts discount:discount_list) {
			price= discount.apply(price);
		}
		
		return price;
	}
}