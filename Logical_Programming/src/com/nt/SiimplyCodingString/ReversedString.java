package com.nt.SiimplyCodingString;

//Write a program to reverse the  String

public class ReversedString {

	public static void main(String[] args) {
		
		String str = "NO26 Sound";
		
		String reversed = "";
		
		for(int i=0;i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			reversed = ch + reversed;
		}
		System.out.println("Revesed String::"+reversed);
	}
}
