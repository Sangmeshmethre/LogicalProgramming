package com.nt.SiimplyCodingString;


//Create a word encoding Program which moves each letter by 2 e.g:A become C, B becomes D, Y become A and so on.

public class EncodingProgram {

	public static void main(String[] args) {
		
		String str = "SIMPLY";
		
		String encode = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch=='Y' || ch=='Z' || ch=='y' || ch=='z')
				
				ch -= 26;
			
			ch += 2;
			
			encode = encode+ch;
		}
		
		System.out.println("Print Encoding Progrma::"+encode);
	}
}
