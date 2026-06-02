package com.java.mysql_practice;

public class Book {
  String b_name;
  String author;
  int issue_date;
  String email_id;
	@Override
public String toString() {
	return "Book [b_name=" + b_name + ", author=" + author + ", issue_date=" + issue_date + ", email_id=" + email_id
			+ "]";
}
	public String getB_name() {
	return b_name;
}
public void setB_name(String b_name) {
	this.b_name = b_name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getIssue_date() {
	return issue_date;
}
public void setIssue_date(int issue_date) {
	this.issue_date = issue_date;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
