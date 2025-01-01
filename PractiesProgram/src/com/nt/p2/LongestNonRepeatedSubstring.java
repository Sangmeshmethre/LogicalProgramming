package com.nt.p2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestNonRepeatedSubstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		longestNonRepeatedsubstring(str);
	}
	
	public static void longestNonRepeatedsubstring(String str) {
		
		String longestString = null;
		int longestLength = 0;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
		
			char ch = str.charAt(i);
			
			if(!map.containsKey(ch)) {
				
				map.put(ch, i);
			}else {
				i = map.get(ch);
				map.clear();
			}
			
			if(map.size() > longestLength) {
				longestLength = map.size();
				longestString = map.keySet().toString();
			}
		}
		
		System.out.println("Longest Non Repeated substring::"+longestString);
		System.out.println("Longest Non Repeated Length::"+longestLength);
	}
}
