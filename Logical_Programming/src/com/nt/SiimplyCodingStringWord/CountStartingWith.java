package com.nt.SiimplyCodingStringWord;


//Count the number of Words Starting With D in a sentence


public class CountStartingWith {

	public static void main(String[] args) {
		
		String str = "A REED SEED";
		str = str+" ";
		String word = "";
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				
				if(word.startsWith("R"))
					count++;
				word="";
			}
		}
		System.out.println("Starting With::"+count);
	}
}