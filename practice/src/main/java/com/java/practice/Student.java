package com.java.practice;

public class Student {
    String name;
    int roll_no;
    int marks;
	
    public Student(String name,int roll_no,int marks){
    	this.name=name;
    	this.roll_no=roll_no;
    	this.marks=marks;
    	
    }
    public String gradeCalculation(){
    	if(marks>80) {
    		return "A";
    	}else if(marks>70 && marks<80) {
    		return "B";
    	}else {
    		return "C";
    	}
    }
    public void displayDetails() {
    	System.out.println("The Student "+name+" with roll_no "+roll_no+" has secured grade: "+ gradeCalculation());
    }
    
	

}
