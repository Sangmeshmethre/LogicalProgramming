package com.nt.SiimplyCodingStringWord;

//Print the first 2 character of each word in a sentence 

public class FirstTwoCharacterOfEachWord {

	public static void main(String[] args) {
		
		String str = "In the box";
		str = str+" ";
		
		String word = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch != ' ') {
				word = word+ch;
			}else {
				System.out.println(word.substring(0,2));
				
				word = "";
			}
		}
	}
}
