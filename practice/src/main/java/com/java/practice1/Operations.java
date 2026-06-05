package com.java.practice1;

public class Operations {

	
	public int add(int a,int b) {
		return a+b;
	}
	public int multiply(int a,int b) {
		return a*b;
	}
	public int subtract(int a,int b) {
		return a-b;
	}
	public boolean palindrome_check(int num) {
		  
        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
        	return true;
        }
        return false;
	}
	public int Count_vowels(String str) {
		int c=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				c++;
			}
		}
		return c;
	}
	public boolean is_prime(int num) {
		
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
	}
	public boolean isEven(int no) {
		if(no%2==0) {
			return true;
		}
		return false;
	}
	public int max_num(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations o=new Operations();
		o.add(2, 3);
		o.multiply(3, 2);
		o.subtract(4, 2);
	}

}
