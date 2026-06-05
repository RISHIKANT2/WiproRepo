package com.java.practice1;

public class Mobile {

	String brand;
	int battery_lvl=0;
	
	Mobile(String brand,int battery_lvl){
		this.battery_lvl=battery_lvl;
		this.brand=brand;
	}
	public void make_call() {
		System.out.println("Your call is connecting, Please wait");
		
	}
	
	public void chargeBattery() {
		System.out.println("Your Battery is on charging mode");
	}
	public void checkBattery() {
		battery_lvl++;
		System.out.println("Your battery is "+battery_lvl+" ,Call again to check battery level increase");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Mobile m1=new Mobile("Redmi Note 10 Lite",5);
       m1.make_call();
       m1.chargeBattery();
       m1.checkBattery();
       m1.checkBattery();
	}

}
