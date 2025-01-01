package com.nt.p2;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int number = 123;
		
		int temp = number;
		
		int rev = 0;
		
		while(number > 0) {
			
			int d = number % 10;
			
			rev = rev * 10+d;
			
			number = number/10;
		}
		System.out.println(rev);
		if(temp == rev) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not palindrome");
		}
	}
}
