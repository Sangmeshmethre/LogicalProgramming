package com.nt.p1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterToNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
		for(Character keyset:map.keySet()) {
			System.out.println(keyset+" "+map.get(keyset));
		}
	}
}
