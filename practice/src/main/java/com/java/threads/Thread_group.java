package com.java.threads;

public class Thread_group {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadGroup group1 = new ThreadGroup("Group1");
		ThreadGroup group2 = new ThreadGroup("Group2");

		Thread obj1 = new Thread(group1,
				() -> System.out.println("thread1 is working" + Thread.currentThread().getThreadGroup().getName()));

		Thread obj2 = new Thread(group1,
				() -> System.out.println("thread2 is working" + Thread.currentThread().getThreadGroup().getName()));

		Thread obj3 = new Thread(group2,
				() -> System.out.println("thread3 is working" + Thread.currentThread().getThreadGroup().getName()));

		Thread obj4 = new Thread(group2,
				() -> 
		System.out.println("thread4 is working"+Thread.currentThread().getThreadGroup().getName()));

		

		obj1.setPriority(Thread.MAX_PRIORITY);
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
	}



	}


