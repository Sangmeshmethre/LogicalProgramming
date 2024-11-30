package com.nt.SiimplyCodingString;


//Write a program to find if a String is palindrome;
public class PalindromeString {

	public static void main(String[] args) {
		
		String str = "Madam";
		
		String sn = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			sn = ch+sn;
			
		}
		if(str.equalsIgnoreCase(sn)) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not A Palindrome String");
		}
	}
}
