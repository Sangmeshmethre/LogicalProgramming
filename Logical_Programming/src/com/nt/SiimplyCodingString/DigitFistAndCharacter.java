package com.nt.SiimplyCodingString;

//Create a String  With Digits First and then Character

public class DigitFistAndCharacter {

	public static void main(String[] args) {
		
		String str = "NO26 Sound";
		
		String d = "", r="";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch)) {
				d = d+ch;
			
			}else {
				r = r+ch;
			}
		}
		String sn = d+r;
		System.out.println("Print first Digits then Character::"+sn);
	}
}
