package com.nt.p1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestNonRepeatingString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string::");
		String str =sc.nextLine();
		
		longestNonRepeatingString(str);
	}
	
	public static void longestNonRepeatingString(String str) {
		
		String largestLength = null;
		int length = 0;
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			}else {
				i=map.get(ch);
				map.clear();
			}
			if(map.size() > length) {
				length = map.size();
				largestLength = map.keySet().toString();
			}
		}
		System.out.println("longest Non Repeating substring Length::"+largestLength);
		System.out.println("Longest Non Repeated Length::"+length);
	}
}
