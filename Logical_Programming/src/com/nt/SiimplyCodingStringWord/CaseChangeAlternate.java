package com.nt.SiimplyCodingStringWord;


//Take a Sentence and change case of each alternate word

public class CaseChangeAlternate {

	public static void main(String[] args) {
		
		String str = "A RED SEED";
		str =str+" ";
		String word = "";
		String sn = "";
		int count = 0;
		
		for(int i=0;i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				if(count++%2==0) {
					sn = sn+word.toUpperCase()+" ";
				}else {
					sn = sn+word.toLowerCase()+" ";
				}
				
				word = "";
			}
		}
		System.out.println(sn);
	}
}
