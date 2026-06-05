package com.java.practice1;

public class Rectangle {

	int length,width;
	 Rectangle(int len,int width){
		 this.length=len;
		 this.width=width;
	 }
	 public void calculateArea() {
		 System.out.println("The area of rectangle is "+(length*width));
	 }
	
	 public void calculatePerimeter() {
		 System.out.println("The area of rectangle is "+2*(length+width));
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Rectangle r1=new Rectangle(8,5);
       r1.calculateArea();
       r1.calculatePerimeter();
	}

}
