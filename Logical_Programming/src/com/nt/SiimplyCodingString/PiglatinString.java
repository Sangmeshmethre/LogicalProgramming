package com.nt.SiimplyCodingString;

import java.util.Scanner;

// String Encoding program - Piglatin

public class PiglatinString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		String pl = "";
		
		for(int i=0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			ch = Character.toUpperCase(ch);
			
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				
				if(i==0) {
					pl = str+"WAY";
				}else {
					pl=str.substring(i)+str.substring(0,i)+"AY";
					break;
				}
			}
		}
		System.out.println("Piglatin String is::"+pl);
	}
}
