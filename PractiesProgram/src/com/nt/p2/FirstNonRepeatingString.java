package com.nt.p2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string::");
		String str =sc.nextLine();
		
		NonRepeatingString(str);
	}
	
	public static void NonRepeatingString(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entryset:map.entrySet()) {
			
			if(entryset.getValue()==1) {
				System.out.println(entryset);
				break;
			}
		}
	}
}
