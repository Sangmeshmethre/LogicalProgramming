package com.nt.SiimplyCodingStringWord;


//Write a program to swap first and Last letter of each word of sentence


public class SwapFirstAndLastLetter {

	public static void main(String[] args) {
		
		String str = "In The box";
		str = str+" ";
		String word ="", sn = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				
				char F = word.charAt(0);
				char L = word.charAt(word.length()-1);
				String m = word.substring(1, word.length()-1);
				sn = sn+L+m+F+" ";
				
				word = "";
			}
		}
		System.out.println(sn);
	}
}
