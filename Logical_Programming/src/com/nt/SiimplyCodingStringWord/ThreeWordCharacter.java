package com.nt.SiimplyCodingStringWord;


//Print only words having 3 characters in a Sentence

public class ThreeWordCharacter {

	public static void main(String[] args) {
		
		String str = "A Red Seed";
		str =str+" ";
		String word = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				
				if(word.length() == 3) {
					System.out.println(word);
				}
				
				word = "";
			}
		}
	}
}
