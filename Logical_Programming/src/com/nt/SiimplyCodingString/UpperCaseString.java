package com.nt.SiimplyCodingString;


//Create a new String Containing  only upperCase Character

public class UpperCaseString {

	public static void main(String[] args) {
		
		String str = "Its Simple";
		
		String sn = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch))
				sn = sn + ch;
		}
		System.out.println("Only Upper Case Character String::"+sn);
	}
}