package com.nt.SiimplyCodingCharacter;

//Print only Upper Case Characters of String

public class OnlyUpperCaseCharacter {

	public static void main(String[] args) {
		
		String str = "Its Simple";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				System.out.println("Only Upper case::"+ch);
			}
		}
		
	}
}
