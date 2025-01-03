package com.nt.ApexonLogical;

// String str = "abcabcbb";

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestNonRepitedSubString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		findLargestRepitingSubstring(str);
	}
	
	public static void findLargestRepitingSubstring(String str) {
		
		String largestString = null;
		int largestLength = 0;
		
		char[] arr = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<arr.length; i++) {
			
			char ch = str.charAt(i);
			
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			}else {
				i = map.get(ch);
				map.clear();
			}
			
			if(map.size() > largestLength) {
				largestLength = map.size();
				largestString = map.keySet().toString();
			}
		}
		System.out.println("Largest String::"+largestString);
		System.out.println("Largest Length ::"+largestLength);
	}
}
