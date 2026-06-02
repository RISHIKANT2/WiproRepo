package com.java.abstraction;

import java.util.ArrayList;

public class Custom_Sorting {
	String name;
	int id;
	int marks;
	
	public Custom_Sorting(String name,int id,int marks) {
		this.name= name;
		this.id=id;
		this.marks=marks;
	}
	

	@Override
	public String toString() {
		return "Custom_Sorting [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Custom_Sorting> arr=new ArrayList<>();
      arr.add(new Custom_Sorting("Rishikant",1,98));
      arr.add(new Custom_Sorting("Prashant",2,95));
      arr.add(new Custom_Sorting("Rohit",3,85));
      arr.sort((a,b)->a.name.compareTo(b.name));
      for(Custom_Sorting e:arr) {
    	  System.out.println(e);
      }
      
	}

}
