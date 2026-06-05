package com.java.mysql_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Book b=new Book();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book details");
        System.out.println("Enter Book name:");
        String b_name=sc.next();
        System.out.println("Enter the author name");
        String author=sc.next();
        System.out.println("Enter the issue date");
        int date=sc.nextInt();
        System.out.println("Enter email_id");
        String e_mail=sc.next();
        try {
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        
        String URL = "jdbc:mysql://127.0.0.1:3306/book";
        String USERNAME = "root";
		String PASSWORD = "root";
		String query = "insert into employee(eid,ename,dept,salary) values(?,?,?,?)";
        Connection connobj = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        
        
        PreparedStatement statement = connobj.prepareStatement(query);
		
		statement.setString(1, b_name);
		statement.setString(2, author);
		statement.setInt(3, date);
		statement.setString(4, e_mail);
		statement.executeUpdate();// executing the query
		
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}
