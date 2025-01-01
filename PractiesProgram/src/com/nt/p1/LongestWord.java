package com.nt.p1;

public class LongestWord {

	public static void main(String[] args) {
		
		String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
		String toSearch = "ODG";
		
		longestWord(dict, toSearch);
	}
	
	public static void longestWord(String[] dict, String toString) {
		
		String word = "", lword ="";
		int maxLength = 0;
		for(int i=0; i<dict.length; i++) {
			
			String str = dict[i];
			
			str = str+" ";
			
			for(int j=0; j<str.length(); j++) {
				
				char ch = str.charAt(j);
				
				if(ch !=' ') {
					word = word+ch;
				}else {
					if(word.length() > lword.length()) {
						lword = word;
					}
					
					word = "";
				}
			}
		}
		
		for(String word1:dict) {
			
			if(word1.contains(toString)) {
				maxLength = Math.max(maxLength, word1.length());
			}
		}
		
		System.out.println("Longest Word::"+lword);
		System.out.println("Longest word length::"+maxLength);
	}
}
