package com.nt.ApexonLogical;


/*Given a sentence/phrase and two words,
return the minimum distance between the words.

Example:
String str = “the quick the brown quick brown the frog”
String word1 = “quick”
String word2 = "frog"

//Return 2
*/

public class MinimumDistatnceOf2Word {

	public static void main(String[] args) {
		
		String str = "the quick the brown quick brown the frog";
		String word1 = "quick";
		String word2 = "frog";
		
		findMinimumDistatnce(str, word1, word2);
	}
	
	public static void findMinimumDistatnce(String str, String word1, String word2) {
		
		int minLength = Integer.MAX_VALUE;
		String[] word = str.split(" ");
		int lastIndex1 = -1;
		int lastIndex2 = -1;
		
		for(int i=0; i<word.length; i++) {
			
			if(word[i].equals(word1)) {
				lastIndex1 = i;
				if(lastIndex2 != -1) {
					minLength = Math.min(minLength, Math.abs(lastIndex1-lastIndex2));
				}
			}
			if(word[i].equals(word2)) {
				lastIndex2 = i;
				if(lastIndex1 != -1) {
					minLength = Math.min(minLength, Math.abs(lastIndex1-lastIndex2));
				}
			}
		}
		System.out.println("Minimum Length::"+minLength);
	}
}
