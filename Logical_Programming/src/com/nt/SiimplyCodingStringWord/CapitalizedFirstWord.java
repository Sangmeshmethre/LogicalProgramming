package com.nt.SiimplyCodingStringWord;


//Write a Program to capitalized each word of a sentence

public class CapitalizedFirstWord {

	public static void main(String[] args) {
		
		String str = "a red seed";
		str =str+" ";
		String word = "",sn = "";
		
		for(int i=0;i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				
				char F = word.charAt(0);
				F = Character.toUpperCase(F);
				sn = sn+F+word.substring(1)+" ";
				
				word = "";
			}
		}
		System.out.println(sn);
	}
}
