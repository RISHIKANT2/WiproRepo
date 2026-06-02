package com.java.arraylist;

public class Map_Strategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface MapRoute{
	void route();
}
class Fastest_route implements MapRoute{

	@Override
	public void route() {
		// TODO Auto-generated method stub
		System.out.println("You have choosen the fastest route");
	}
	
	
}
class Slowest_route implements MapRoute{

	@Override
	public void route() {
		// TODO Auto-generated method stub
		System.out.println("You have choosen the fastest route");
	}
	
	
}
class Marine_route implements MapRoute{

	@Override
	public void route() {
		// TODO Auto-generated method stub
		System.out.println("You have choosen the fastest route");
	}
	
	
}
class Map_navigator{
	MapRoute routes;
	Map_navigator(MapRoute routes){
		this.routes =routes;
	}
	void navigatior() {
		routes.route();
	}
}