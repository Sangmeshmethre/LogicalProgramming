package com.nt.ApexonLogical;


/*Given a string,
return the first non-repeating character.

Examples:
String str1 = "12345"
//Return 1

String str2 = "abbacd"
//Return c
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FistNonRepeatingCharacterString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		findFistNonRepeatingChar(str);
	}
	
	public static void findFistNonRepeatingChar(String str) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		for(Entry<Character, Integer> keyset :map.entrySet()) {
			
			if(keyset.getValue() == 1) {
				System.out.println(keyset);
				break;
			}
		}
	}
}
