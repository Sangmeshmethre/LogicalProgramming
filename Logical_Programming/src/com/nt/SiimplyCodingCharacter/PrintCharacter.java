package com.nt.SiimplyCodingCharacter;


// Print each character of the string in separate line

public class PrintCharacter {

	public static void main(String[] args) {
		
		String str = "ITS SIMPLE";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			System.out.println(ch);
		}
	}
}
