package com.nt.ApexonLogical;


/*Convert a string as given in the format below:

Example:
aabbb into a2b3
aaaa into a4
a into a1*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintCharactrToNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		for(Character key:map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
	}
}
