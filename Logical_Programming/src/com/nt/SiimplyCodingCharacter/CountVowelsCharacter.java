package com.nt.SiimplyCodingCharacter;

//Count total Vowels in Character

public class CountVowelsCharacter {

	public static void main(String[] args) {
		
		String str = "Its Numbers";
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			ch = Character.toUpperCase(ch);
			
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
		}
		System.out.println("Count Vowels in Character::"+count);
	}
}
