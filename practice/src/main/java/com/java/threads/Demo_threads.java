package com.java.threads;

public class Demo_threads extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Demo_threads d1=new Demo_threads();
		d1.setName("t1");
		
		Demo_threads d2=new Demo_threads();
		d2.setName("t2");
		d1.start();
		d1.join();
		d2.start();
	}
	
	public void Reverse_Counting(int num) {
		for(int i=num;i>=1;i--) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
	public void Counting() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
	public void run() {
		if(Thread.currentThread().getName().equals("t1")) {
			Reverse_Counting(4);
		}else if(Thread.currentThread().getName().equals("t2")){
			Counting();
		}
	}

}
