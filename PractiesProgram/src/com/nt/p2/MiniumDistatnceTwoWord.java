package com.nt.p2;

public class MiniumDistatnceTwoWord {

	public static void main(String[] args) {
		
		String str = "the quick the brown quick brown the frog";
		String word1 = "quick";
		String word2 ="frog";
		
		minimumDistanceTwoWord(str, word1, word2);
	}
	
	public static void minimumDistanceTwoWord(String str, String word1, String word2) {
		
		int mindist = Integer.MAX_VALUE;
		
		int lastIndex1 = -1;
		int lastIndex2 = -1;
		
		String[] word = str.split(" ");
		
		for(int i=0; i<word.length; i++) {
			
			if(word[i].equals(word1)) {
				
				lastIndex1 = i;
				
				if(lastIndex1 != -1) {
					mindist = Math.min(mindist, Math.abs(lastIndex1-lastIndex2));
				}
			}
			
			if(word[i].equals(word2)) {
				
				lastIndex2 = i;
				
				if(lastIndex2 !=-1) {
					mindist = Math.min(mindist, Math.abs(lastIndex2-lastIndex1));
				}
			}
		}
		System.out.println("Minimum Distatnce of Two Word::"+mindist);
		
	}
}
