package com.java.exceptio_handingl;

public class Under_Age_check {
     static int age;
     Under_Age_check(int age){
    	 this.age=age;
     }
     public void Check_age_validity() throws UnderAgeEeption{
    	 if(age<18) {
    		 throw new UnderAgeEeption("Your age is not valid for Driving");
    	 }else {
    		 System.out.println("You are Eligible for driving");
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Under_Age_check c=new Under_Age_check(12) ;
			
		
	}

}
class UnderAgeEeption extends Exception{
	 public UnderAgeEeption(String message) {
		 super(message);
	 }
}