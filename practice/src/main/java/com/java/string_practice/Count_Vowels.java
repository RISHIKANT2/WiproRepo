package com.java.string_practice;

public class Count_Vowels {

	public int Count_vowels(String str) {
		int c=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count_Vowels v= new Count_Vowels();
		String str="Apple";
		System.out.println("The no vowels in string "+str+"is "+v.Count_vowels(str));


}
}