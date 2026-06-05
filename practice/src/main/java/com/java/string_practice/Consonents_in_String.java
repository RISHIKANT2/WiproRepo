package com.java.string_practice;

public class Consonents_in_String {
 
	public int Count_consonent(String str) {
		int c=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				continue;
			}else {
				c++;
			}
		}
		return c;
	}
	public String Replace_consonent_with_zero(String str) {
		int c=0;
		str=str.toLowerCase();
		StringBuilder result = new StringBuilder(str);

	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);

	        if (ch != 'a' && ch != 'e' && ch != 'i' &&
	            ch != 'o' && ch != 'u') {

	            result.setCharAt(i, '0');
	        }
	    }

	    return result.toString();
	}
	public int String_length(String str) {
		return str.length();
	}
	public String To_UpperCase(String str) {
		return  str.toUpperCase();
	}
	public String Reverse_Strin(String str) {
	 return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consonents_in_String c=new Consonents_in_String() ;
		String str="apple";
		System.out.println("The consonent in the string "+str+" is "+c.Count_consonent(str));
		System.out.println("The length of the string "+str+" is "+c.String_length(str));
		System.out.println("The new of the string after rep;acing consoent with '0' is "+str+" is "+c.Replace_consonent_with_zero(str));
	}

}
