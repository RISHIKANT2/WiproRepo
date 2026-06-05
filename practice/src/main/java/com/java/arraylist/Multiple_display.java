package com.java.arraylist;

public class Multiple_display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d1=new mobile_app("Raining Today");
		Display d2=new Website("Raining Today");
		Display d3=new LED("Raining Today");
	   Display[] dn= {d1,d2,d3};
		DisplayMonitor d=new DisplayMonitor(dn);
		d.notifyMachine("Raining Today");
	}

}
interface Display{
	void updates(String name);
}
class mobile_app implements Display{
   String name;
   
   mobile_app(String name){
	   this.name=name;
   }
	@Override
	public void updates(String name) {
		// TODO Auto-generated method stub
		System.out.println("mobile app got a notification that its "+name);
	}
	
}
class Website implements Display{
	   String name;
	   Website(String name){
		   this.name=name;
	   }
		@Override
		public void updates(String name) {
			// TODO Auto-generated method stub
			System.out.println("Website got a notification that its "+name);
		}
		
	}
class LED implements Display{
	   String name;
	   LED(String name){
		   this.name=name;
	   }
		@Override
		public void updates(String name) {
			// TODO Auto-generated method stub
			System.out.println("LED got a notification that its "+name);
		}
		
	}

class DisplayMonitor{
	 Display[] monitors;
	 DisplayMonitor(Display[] monitors){
		 this.monitors=monitors;
	 }
	 public void  notifyMachine(String name) {
		 for(Display u:monitors) {
			 u.updates(name);
		 }
	 }
}