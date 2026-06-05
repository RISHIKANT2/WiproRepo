package com.java.practice1;

public class Book {
	String title;
	String author;
	String issued;
	
	public Book(String title,String author,String issued) {
	 this.title=title;
	 this.author=author;
	 this.issued=issued;
	 System.out.println("The book is issued");
	}
	public void displayStatus() {
		System.out.println("The book issued is "+title+" that has author "+author+" on date "+issued);
	}
	public void returnBook() {
		System.out.println("The book with title "+title+" and author "+author+" has been returned .");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Book b1=new Book("Finding Nemo","William ShakesPear","12.02.1980");
       b1.displayStatus();
       b1.returnBook();
	}

}
