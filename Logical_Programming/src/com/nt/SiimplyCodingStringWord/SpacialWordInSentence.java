package com.nt.SiimplyCodingStringWord;


//Print all special word in a String . eg.Anna, bob


public class SpacialWordInSentence {

	public static void main(String[] args) {
		
		String str = "MOM OR DAD";
		
		str =str+" ";
		
		String word = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				
				char f = word.charAt(0);
				char l = word.charAt(word.length()-1);
				if(Character.toUpperCase(f) == Character.toUpperCase(l))
					System.out.println(word);
				
				word ="";
			}
		}
	}
}