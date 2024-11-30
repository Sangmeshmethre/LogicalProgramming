package com.nt.SiimplyCodingCharacter;

//Print only Alphabets Character of String

public class OnlyAlphabates {

	public static void main(String[] args) {
		
		String str = "Its Simply";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isAlphabetic(ch)) {
				System.out.println("Print only Alphabets::"+ch);
			}
		}
	}
}
