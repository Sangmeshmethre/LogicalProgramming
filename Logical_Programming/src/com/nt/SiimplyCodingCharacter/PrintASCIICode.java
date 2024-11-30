package com.nt.SiimplyCodingCharacter;


// Print ASCII Code of each character of String
public class PrintASCIICode {

	public static void main(String[] args) {
		
		String str = "ITS SIMPLE";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			System.out.println(i+1+" "+ch+" "+(int)ch);
		}
	}
}
