package com.java.exceptio_handingl;

import java.util.Scanner;

public class StudentResult {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks for Subject 1: ");
            int m1 = sc.nextInt();

            System.out.print("Enter marks for Subject 2: ");
            int m2 = sc.nextInt();

            System.out.print("Enter marks for Subject 3: ");
            int m3 = sc.nextInt();

            // Validate marks (0–100)
            if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {
                throw new InvalidMarksException("Marks should be between 0 and 100");
            }

            int total = m1 + m2 + m3;
            double average = total / 3.0;

            System.out.println("Total Marks: " + total);
            System.out.println("Average: " + average);

            // Pass/Fail condition (each subject >= 40)
            if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: FAIL");
            }

        } catch (InvalidMarksException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }
    }
}
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}
