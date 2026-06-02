package com.wipro.DIproject;

public class Student {
   private String name;
   private int roll_no;
   private Address address;
   
   public Student(String name,int roll_no,Address address) {
	   this.name=name;
	   this.roll_no=roll_no;
	   this.address=address;
   }


public void show() {
	System.out.println("name"+" "+name+" "+"rollN0: "+roll_no+" "+"address: "+address.city);
}
   
}
