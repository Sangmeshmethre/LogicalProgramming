package com.nt.SiimplyCodingStringWord;


//Count the number of words ending  with D in a Sentence


public class CountContains {

	public static void main(String[] args) {
		
		String str = "A Reed Seed";
		str =str+" ";
		String word = "";
		int count=0;
		
		for(int i=0;i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				if(word.contains("e")) {
					count++;
				}
				word = "";
			}
		}
		System.out.println("Contains Count::"+count);
	}
}
