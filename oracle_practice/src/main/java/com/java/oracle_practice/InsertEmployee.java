package com.java.oracle_practice;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEmployee {
	public static void addEmployee() {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the id of Employee:");
		int emp_id=sc.nextInt();
		System.out.println("Enter the name of Employee:");
		String emp_name=sc.next();
		System.out.println("Enter the department of Employee:");
		String emp_dept=sc.next();
		System.out.println("Enter the salary of Employee:");
		int emp_salary= sc.nextInt();
		 Connection conn = DbConnect.getConnection();
		   try {
			   String query="INSERT INTO Employee VALUES(?,?,?,?)";
			   PreparedStatement ps=conn.prepareStatement(query);
			   ps.setInt(1,emp_id);
			   ps.setString(2, emp_name);
			   ps.setString(3, emp_dept);
			   ps.setInt(4, emp_salary);
			   ps.executeUpdate();
			   System.out.println("Employee Detail Entered Successfully");
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
	}
	
	public static void getEmployeeData() {
		
		   Connection conn=DbConnect.getConnection();
		   try {
			    Statement stmt= conn.createStatement();
			    ResultSet rs= stmt.executeQuery("SELECT * FROM Employee");
			    while(rs.next()){
			    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			    }
			    
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
	   }
	
	public static void updateEmployee() {
		Scanner sc=new Scanner(System.in);
		
		Connection conn= DbConnect.getConnection();
		System.out.println("Enter the name of Employee to be updated:");
		String name=sc.next();
		System.out.println("Enter the id of Employee to be updated:");
		int id=sc.nextInt();
		try {
			String query="UPDATE Employee SET emp_name=? WHERE emp_id=?";
			 PreparedStatement ps =conn.prepareStatement(query);
			 ps.setString(1, name);
			 
			 ps.setInt(2, id);
			 ps.executeUpdate();
		}catch(Exception e) {
			 e.printStackTrace();
		}
	}
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   
//	   for(int i=0;i<4;i++) {
//		   addEmployee();
//	   }
	   getEmployeeData();
	   updateEmployee();
	   
   }
   
}

