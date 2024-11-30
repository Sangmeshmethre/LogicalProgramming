package com.nt.SiimplyCodingString;

//Create a new String after removing all spaces in a String

public class RemoveAllSpace {

	public static void main(String[] args) {
		
		String str = "NO26 Sound";
		
		String sn = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(!Character.isWhitespace(ch)) {
				
				sn = sn+ch;
			}
		}
		System.out.println("Remove All White Space::"+sn);
	}
}
