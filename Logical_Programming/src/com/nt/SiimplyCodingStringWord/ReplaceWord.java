package com.nt.SiimplyCodingStringWord;


//Change Red with Blue in a sentence and print it.

public class ReplaceWord {

	public static void main(String[] args) {
		
		String str = "A RED SEED";
		str = str+" ";
		String word = "", sn = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				if(word.equals("RED")) {
					sn = sn+"Blue"+" ";
				}else {
					sn = sn+word+" ";
				}
				word = "";
			}
		}
		System.out.println(sn);
	}
}
