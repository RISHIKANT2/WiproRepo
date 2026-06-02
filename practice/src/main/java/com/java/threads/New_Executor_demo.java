package com.java.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class New_Executor_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=8;
		ExecutorService serv = Executors.newFixedThreadPool(3); 
		serv.submit(()->System.out.println("The Addition of two no is "+(a+b)+" "+ Thread.currentThread().getName()));
		serv.submit(()->System.out.println("The  Multiplication of two no is "+(a*b)+" "+ Thread.currentThread().getName()));
		serv.submit(()->System.out.println("The Subtraction of two no is "+(a-b)+" "+ Thread.currentThread().getName()));
		serv.submit(()->System.out.println("The Division of two no is "+(a/b)+ " "+Thread.currentThread().getName()));
		serv.shutdown();
	}

}
