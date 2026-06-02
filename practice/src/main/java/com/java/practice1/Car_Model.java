package com.java.practice1;

public class Car_Model {

	String brand;
	int model_no;
	
	 Car_Model(String brand,int model_no) {
		  this.brand=brand;
		  this.model_no=model_no;
	}
	 void start() {
		 System.out.println("Drive mode On");
		 
	 }
	 static class Lamborghini extends Car_Model  {

		Lamborghini(String brand, int model_no) {
			super(brand, model_no);
			// TODO Auto-generated constructor stub
		}
		
	      
	 }
	 static class Audi extends Car_Model  {

			Audi(String brand, int model_no) {
				super(brand, model_no);
				// TODO Auto-generated constructor stub
			}
			
		      
		 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
