package com.nt.SiimplyCodingCharacter;


//Print only Digits Character of a string

public class PrintOnlyDigite {

	public static void main(String[] args) {
		
		String str = "Its Simple45";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch)) {
				System.out.println("Only Digit::"+ch);
			}
		}
	}
}
