package com.nt.SiimplyCodingCharacter;

//Print only LowerCase Characters of a String

public class OnlyLowerCaseCharacter {

	public static void main(String[] args) {
		
		String str = "Its Simple";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch =str.charAt(i);
			
			if(Character.isLowerCase(ch)) {
				System.out.println("print Only Lower Case::"+ch);
			}
		}
	}
}
