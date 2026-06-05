package com.java.abstraction;

abstract class Employee{
	int salary;
	String name;
	public abstract void calculateBonus();
	public void EmployeeDetails() {
		System.out.println("The Manager name is "+name+" and his salary is "+salary);
	}
}
class Manager extends Employee{
	int bonus=0;
	Manager(String name,int salary){
		 super.name=name;
		 super.salary=salary;
		 
	}
	
	public  void calculateBonus() {
		bonus= (int) (0.2*super.salary);
		System.out.println("The Bonus is: "+bonus);
	}
	
}
class Developer extends Employee{
	int bonus=0;
	public  void calculateBonus() {
		bonus= (int) (0.1*super.salary);
		System.out.println("The Bonus is: "+bonus);
	}
	Developer(String name,int salary){
		 super.name=name;
		 super.salary=salary;
		 
	}
	
}













public class Employee_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee mn= new Manager("Rishikant",100000000);
         mn.calculateBonus();
         mn.EmployeeDetails();
         Employee d1= new Developer("Prashant",300000);
         d1.calculateBonus();
         d1.EmployeeDetails();
	}

}
