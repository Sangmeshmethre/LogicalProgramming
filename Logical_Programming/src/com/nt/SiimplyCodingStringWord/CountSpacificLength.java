package com.nt.SiimplyCodingStringWord;


//Count the number of Words ending with D in a Sentence


public class CountSpacificLength {

	public static void main(String[] args) {
		
		String str = "A RED SEED";
		str = str+" ";
		String word = "";
		int count =0;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				
				if(word.length() == 3)
					count++;
				
				word = "";
			}
		}
		System.out.println(count);
	}
}