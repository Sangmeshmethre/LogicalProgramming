package com.nt.SiimplyCodingStringWord;


//Print only the words starting with R in a sentence


public class StartingWithR {

	public static void main(String[] args) {
		
		String str = "A Red Seed";
		
		str = str+" ";
		
		String word = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				if(word.startsWith("R")) {
					System.out.println(word);
				}
				
				word = "";
			}
		}
	}
}
