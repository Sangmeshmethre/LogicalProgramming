package com.nt.SiimplyCodingString;

//Create new String with upperCAse first and then remaining String

public class FistUpperCaseThenLowerCase {

	public static void main(String[] args) {
		
		String str = "NO26 Sound";
		
		String u = "", l = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				
				u = u+ch;
			}else {
				l = l+ch;
			}
			String sn = u+l;
			System.out.println("Print First UpperCase then lower Case::"+sn);
		}
	}
}
