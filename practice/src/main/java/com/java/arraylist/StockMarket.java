package com.java.arraylist;

public class StockMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Subscribers1 user1 = new Invester1("Rishikant");

		Subscribers1 user2 = new Invester2("Prashant");
		Subscribers1 user3 = new Invester3("Rohit");
		Subscribers1 user4 = new Invester4("Rohit");

		Subscribers1 users[] = { user1, user2,user3,user4 };
		StockBroker app = new StockBroker(users);
		app.notifyInvesterService("new stock Report Updated!");
	}

}
interface Subscribers1 {
	void updates(String message);
}

class Invester1 implements Subscribers1 {

	String name;

	public Invester1(String name) {
		this.name = name;
	}

	public void updates(String message) {
		System.out.println(name + " - " + message);
	}
}

class Invester2 implements Subscribers1 {

	String name;

	public Invester2(String name) {
		this.name = name;
	}

	public void updates(String message) {
		System.out.println(name + " - " + message);
	}
}
class Invester3 implements Subscribers1 {

	String name;

	public Invester3(String name) {
		this.name = name;
	}

	public void updates(String message) {
		System.out.println(name + " - " + message);
	}
}
class Invester4 implements Subscribers1 {

	String name;

	public Invester4(String name) {
		this.name = name;
	}

	public void updates(String message) {
		System.out.println(name + " - " + message);
	}
}

class StockBroker {
	Subscribers1[] investers;

	public StockBroker(Subscribers1 investers[]) {
		this.investers = investers;
	}

	public void notifyInvesterService(String msg) {
		for (Subscribers1 invester : investers) {
			invester.updates(msg);
		}
	}

}