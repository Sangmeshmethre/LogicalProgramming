package com.nt.ApexonLogical;

/*Given a dictionary (list of words) and a substring, you have to return the length of the longest word in the dictinary containing the substring.

Example:
String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"}
String toSearch = "ODG";

//Returns 9 (LODGESSSS)
*/
public class LargestWordInArray {

	public static void main(String[] args) {
		
		String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge","mODJ", "LODGESSSS"};
		String toString = "ODG";
		
		String word = "", lword = "";
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
					word="";
				}
			}
		}
		
		for(String word1 :dict) {
			
			if(word1.contains(toString)) {
				maxLength = Math.max(maxLength, word1.length());
			}
		}
		
		System.out.println("Largest Word::"+lword);
		System.out.println("Largest Length::"+maxLength);
	}
}
