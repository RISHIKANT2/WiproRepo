package com.java.threads;

public class Threads_Using_extend extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Threads_Using_extend d1 = new Threads_Using_extend(); // creating a thread1
				d1.setName("t1");
				d1.start(); // starting a thread 1
		Threads_Using_extend d2 = new Threads_Using_extend(); // creating a thread2
				d2.setName("t2");
				d2.start(); // starting a thread 2

			}

			void printTable(int num) {
				for (int i = 1; i <= 10; i++) {
					System.out.println(num + " * " + i + " = " + (num * i) + " - " + currentThread().getName());

				}
			}

			void reverseCounting() {
				for (int i = 10; i >= 1; i--)
					System.out.println(i + " - " + currentThread().getName());
			}

			public void run() // running the thread
			{
				if (currentThread().getName().equals("t1"))
					printTable(3);
				else if(currentThread().getName().equals("t2")) 
					reverseCounting();
			}

		
	}


