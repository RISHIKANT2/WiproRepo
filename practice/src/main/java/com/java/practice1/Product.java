package com.java.practice1;

public class Product {
	 
	String name;
	float price;
	int qnt;
	 
	public Product(String name,float price, int qnt){
		 this.name=name;
		 this.price=price;
		 this.qnt=qnt;
	}
	public float calculateTotalPrice() {
		float total= price*qnt;
		return total;
	}
	public static double totalBill(float [] amount) {
		double total_bill=0; 
		for(int i=0;i<amount.length;i++) {
			total_bill= total_bill+amount[i];
		}
		return total_bill;
	}
	
	public static void main(String args[]) {
		Product p1=new Product("Book",150.50f,2);
		float p1_total=p1.calculateTotalPrice();
		Product p2=new Product("Book",150.50f,2);
		float p2_total=p1.calculateTotalPrice();
		Product p3=new Product("Book",150.50f,2);
		float p3_total=p1.calculateTotalPrice();
		System.out.println("The total_bill is: "+totalBill(new float[] {p1_total,p2_total,p3_total}));
		
	}

}
