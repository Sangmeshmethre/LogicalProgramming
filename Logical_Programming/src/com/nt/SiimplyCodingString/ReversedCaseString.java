package com.nt.SiimplyCodingString;

////Write a program to reverse the case of a String

public class ReversedCaseString {

	public static void main(String[] args) {
		
		String str = "NO26 Sound";
		
		String sn = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				
				sn = sn+Character.toLowerCase(ch);
			}else {
				sn = sn+Character.toUpperCase(ch);
			}
		}
		System.out.println("Convert Upper Case To Lower Case::"+sn);
	}
}
