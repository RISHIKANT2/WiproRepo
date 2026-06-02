package com.java.exceptio_handingl;

import java.util.Scanner;

public class Main {

	 public static void checkAge(int age) throws AgeNotValidException {
	        if (age < 18) {
	            throw new AgeNotValidException("Age is not valid. Must be 18 or above.");
	        } else {
	            System.out.println("Age is valid. You can proceed.");
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (AgeNotValidException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
	

}

class AgeNotValidException extends Exception {
    
    public AgeNotValidException(String message) {
        super(message);
    }
}