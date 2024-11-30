package com.nt.SiimplyCodingStringWord;

public class ContainsE {

	public static void main(String[] args) {
		
		String str = "A Red Seed";
		
		str =str+" ";
		
		String word = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				if(word.contains("e")) {
					System.out.println(word);
				}
				word = "";
			}
		}
	}
}
