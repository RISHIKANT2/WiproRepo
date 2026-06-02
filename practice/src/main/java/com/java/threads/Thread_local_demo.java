package com.java.threads;

public class Thread_local_demo {

	static ThreadLocal<Integer> local=new ThreadLocal<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		 Thread obj= new Thread( () ->   
	        {
	                    local.set(2);
	         System.out.println(local.get());          
	        }		);
	    	
	        obj.start();
	    	
	        

	        Thread obj2= new Thread( () ->   
	        {
	                    local.set(22);
	         System.out.println(local.get());          
	        }		);
	    	
	        obj2.start();
	    	
	    }
	}


