package com.nt.SiimplyCodingString;

// Create a new String Containing   Character

public class CreateNewString {

	public static void main(String[] args) {
		
		String str = "Its Simple";
		
		String sn = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			sn = sn+ch;
		}
		System.out.println("Print New String::"+sn);
	}
}
