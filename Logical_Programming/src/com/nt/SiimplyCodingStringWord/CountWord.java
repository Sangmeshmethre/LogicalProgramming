package com.nt.SiimplyCodingStringWord;


//Count the number of words in a Sentence

public class CountWord {

	public static void main(String[] args) {
		
		String str = "A Red Seed";
		str =str +" ";
		String word = "";
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				
				count++;
				
				word="";
			}
		}
		System.out.println(count);
	}
}
