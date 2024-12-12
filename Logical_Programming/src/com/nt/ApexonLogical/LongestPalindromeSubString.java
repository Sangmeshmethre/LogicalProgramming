package com.nt.ApexonLogical;

/*
Given a string,
return the pallindrome of maximum length and its length. 
(So, you return both the relevant pallindrome substring and its length).

Example:
String str = "forgeeksskeegfor";    // Return {"geeksskeeg",  10}
*/

public class LongestPalindromeSubString {

	public static void main(String[] args) {
		
		String str = "forgeeksskeegfor";
		
		findPalindromeSubString(str);
	}
	
	public static void findPalindromeSubString(String str) {
		
		String word = "", palindrome = "";
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i+1; j<str.length(); j++) {
				
				word = str.substring(i,j);
				
				String reversed = "";
				
				for(int k=0; k<word.length(); k++) {
					
					char ch = word.charAt(k);
					
					reversed = ch+reversed;
				}
				
				if(word.equals(reversed) && word.length() > palindrome.length()) {
					
					palindrome = word;
				}
			}
		}
		System.out.println("Palindrome String is::"+palindrome+" , Length of Palindrome::"+palindrome.length());
		
	}
}
