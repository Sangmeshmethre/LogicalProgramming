package com.nt.SiimplyCodingCharacter;


// Count only upperCase Characters in a String

public class CountUpperCaseCharacter {

	public static void main(String[] args) {
		
		String str = "Its Simple";
		
		int count = 0;
		
		for(int i=0; i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				count++;
			}
		}
		System.out.println("Count Upper Case::"+count);
	}
}