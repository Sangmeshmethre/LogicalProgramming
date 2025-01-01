package com.nt.p2;

import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string::");
		String str = sc.nextLine();
		
		int[] result = longestSubstring(str);
		System.out.println("starting Index::"+result[0]+", Length::"+result[1]);
		System.out.println("substring::"+str.substring(result[0], result[0]+result[1]));
	}
	
	public static int[] longestSubstring(String str) {
		
		int maxLength = 0;
		int maxIndex = 0;
		int currentLength = 1;
		int currentIndex = 0;
		
		for(int i=1; i<str.length(); i++) {
			
			if(str.charAt(i)==str.charAt(i-1)) {
				currentLength++;
			}else {
				if(currentLength>maxLength) {
					maxLength =currentLength;
					maxIndex =  currentIndex;
				}
				currentIndex = i;
				currentLength = 1;
			}
		}
		
		if(currentLength >maxLength) {
			currentLength = maxLength;
			currentIndex = maxIndex;
		}
		
		return new int[] {maxIndex, maxLength};
	}
}
