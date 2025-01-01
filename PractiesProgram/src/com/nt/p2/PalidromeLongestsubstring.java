package com.nt.p2;

import java.util.Scanner;

public class PalidromeLongestsubstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		longestPalindromeSubstring(str);
	}
	
	public static void longestPalindromeSubstring(String str) {
		
		String word = "", pal ="";
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i; j<str.length(); j++) {
				
				word = str.substring(i, j);
				
				String rev ="";
				
				for(int k=0;k<word.length();k++) {
					
					char ch = word.charAt(k);
					
					rev = ch+rev;
				}
				
				if(word.equals(rev) && word.length() > pal.length()) {
					
					pal = word;
				}
			}
		}
		System.out.println("Longest palindrome substring::"+pal);
		System.out.println("Longest palindrome substring length::"+pal.length());
	}
}
