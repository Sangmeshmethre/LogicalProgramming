package com.nt.NumberProgram;


//check if number is palindrome number or not 121, 24642, 3553

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int number = 121;
		
		int temp = number;
		int rev = 0;
		
		while(temp > 0) {
			
			int d = temp % 10;
			rev = rev*10+d;
			temp = temp /10;
		}
		System.out.println("Reversed Number::"+rev);
		
		if(number==rev) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not Palindrome Number::");
		}
	}
}
