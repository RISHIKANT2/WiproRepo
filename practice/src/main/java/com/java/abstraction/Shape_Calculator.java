package com.java.abstraction;

public class Shape_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Shape c=new Circle();
           c.Area(8);
           c.Perimeter(8);
	}

}
interface Shape{
	 void Area(int s);
	 void Perimeter(int s);
		
}
class Circle implements Shape{
	float area;
	float perimeter; 
	public void Area(int side) {
		area= (float) (Math.PI* Math.pow(side, 2));
		System.out.println("The area of Circle is :"+area);
	}
	public void Perimeter(int side) {
		perimeter= (float) (2*Math.PI*side);
		System.out.println("The perimeter of Circle is :"+perimeter);
	}
	
}
class Square implements Shape{
	float area;
	float perimeter; 
    public void Area(int side) {
		area=(float)( Math.pow(side, 2));
		System.out.println("The area of Square is :"+area);
	 }
	public void Perimeter(int side) {
		perimeter= 4*side;
		System.out.println("The perimeter of Square is :"+perimeter);
	}
}
