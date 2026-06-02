package com.java.practice_sets;

public class Dash_pattern {
     
	public void pattern_print(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("-"+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dash_pattern d=new Dash_pattern();
		d.pattern_print(10);
		
	}

}
