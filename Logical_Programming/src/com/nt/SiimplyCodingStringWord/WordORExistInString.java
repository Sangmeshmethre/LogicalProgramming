package com.nt.SiimplyCodingStringWord;


//Find if the word OR exists in a String

public class WordORExistInString {

	public static void main(String[] args) {
		
		String str = "MOM OR DAD";
		str = str+" ";
		String word = "";
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch !=' ') {
				word = word+ch;
			}else {
				
				if(word.equalsIgnoreCase("OR")) {
					count++;
				}
				word = "";
			}
		}
		if(count==0) {
			System.out.println("Word Not Found::");
		}else {
			System.out.println("word found::"+count);
		}
	}
}