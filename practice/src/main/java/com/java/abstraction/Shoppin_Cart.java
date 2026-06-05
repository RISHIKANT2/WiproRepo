package com.java.abstraction;

public class Shoppin_Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        
        Electronics ec1= new Electronics(2000);
        ec1.getPrice();
        ec1.apply_Discount(10);
	}

}
abstract class Product{
  abstract void getPrice();
	
}
interface Discount{
	void apply_Discount(int n);
}
class Electronics extends Product implements Discount{
	int price;
	float discounted_price;
	Electronics(int price){
		this.price=price;
	}
	public void getPrice() {
		System.out.println("The price of this Electronic Product is: "+price);
	}
	public void apply_Discount(int discount) {
		discounted_price= (float) (price - (price * discount / 100.0));
		System.out.println("The Electronic Product after discount is :"+discounted_price);
		
	}
	public void call() {
		System.out.print("Electronics is opened");
	}
}