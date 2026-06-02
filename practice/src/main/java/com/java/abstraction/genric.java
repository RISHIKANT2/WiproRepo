package com.java.abstraction;

public class genric<T extends Number,U extends Number> {
	T no;
	
	public double calculate(T n,U n2) {
		 double result= n.doubleValue()+n2.doubleValue();
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       genric<Double,Integer> g=new genric<Double,Integer>();
       g.calculate(4.5,8);
	}

}
