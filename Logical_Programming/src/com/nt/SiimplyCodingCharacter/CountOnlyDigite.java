package com.nt.SiimplyCodingCharacter;

// Count Digits Number in String

public class CountOnlyDigite {

	public static void main(String[] args) {
		
		String str = "Its Simple 78 Number";
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch =str.charAt(i);
			
			if(Character.isDigit(ch))
				count++;
		}
		
		System.out.println("Count only Digit::"+count);
	}
}
