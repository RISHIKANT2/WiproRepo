package com.java.abstraction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class ArrayList_practice {
	
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
		ArrayList_practice ar= new ArrayList_practice();
		ar.setIs_on("on");
		ar.setName("Rishikant");
		ar.setTitle("Do your best");
		ArrayList_practice ar1= new ArrayList_practice();
		ar1.setIs_on("off");
		ar1.setName("Rohit");
		ar1.setTitle("Shut Up");
		
		ArrayList<ArrayList_practice> a=new ArrayList<ArrayList_practice>();
		a.add(ar1);
		a.add(ar);
		
		for(ArrayList_practice e:a) {
			System.out.println(e);
		}
		ListIterator<ArrayList_practice> itr= a.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}



	@Override
	public int hashCode() {
		return Objects.hash(is_on, name, title);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayList_practice other = (ArrayList_practice) obj;
		return Objects.equals(is_on, other.is_on) && Objects.equals(name, other.name)
				&& Objects.equals(title, other.title);
	}



	@Override
	public String toString() {
		return "[name=" + name + ", title=" + title + ", is_on=" + is_on + "]";
	}

}
