package com.java.abstraction;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_Practice {

	
		String name,title,is_on;
		
		   

		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getTitle() {
			return title;
		}



		public void setTitle(String title) {
			this.title = title;
		}



		public String getIs_on() {
			return is_on;
		}



		public void setIs_on(String is_on) {
			this.is_on = is_on;
		}



		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LinkedList_Practice ar= new LinkedList_Practice();
			ar.setIs_on("on");
			ar.setName("Rishikant");
			ar.setTitle("Do your best");
			LinkedList_Practice ar1= new LinkedList_Practice();
			ar1.setIs_on("off");
			ar1.setName("Rohit");
			ar1.setTitle("Shut Up");
			
			LinkedList<LinkedList_Practice> a=new LinkedList<LinkedList_Practice>();
			a.add(ar1);
			a.add(ar);
			for(LinkedList_Practice e:a) {
				System.out.println(e);
			}
		}



		@Override
		public String toString() {
			return "[name=" + name + ", title=" + title + ", is_on=" + is_on + "]";
		}

	}


