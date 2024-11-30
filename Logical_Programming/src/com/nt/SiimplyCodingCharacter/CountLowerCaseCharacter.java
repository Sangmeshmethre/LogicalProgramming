package com.nt.SiimplyCodingCharacter;

public class CountLowerCaseCharacter {

	public static void main(String[] args) {
		
		String str = "Its Simple";
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
		
			char ch = str.charAt(i);
			
			if(Character.isLowerCase(ch))
				count++;
			
		}
		System.out.println("coutn Only Lower Case::"+count);
	}
}
