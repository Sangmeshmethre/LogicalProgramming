package com.nt.SiimplyCodingStringWord;


//Delete the word RED in a Sentence and print it.

public class DeleteWord {

	public static void main(String[] args) {
		
		String str = "A RED SEED";
		str = str+" ";
		String word = "", sn = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				
				if(!word.equals("RED"))
					sn = sn+word+" ";
				word = "";
			}
		}
		System.out.println(sn);
	}
}
