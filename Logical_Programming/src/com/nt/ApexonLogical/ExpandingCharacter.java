package com.nt.ApexonLogical;


/*Convert a string as given in the format below:

Example:
aabbb into a2b3
aaaa into a4
a into a1*/

import java.util.Scanner;

public class ExpandingCharacter {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter String::");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++) {
			
			if(Character.isAlphabetic(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}else {
				int x = Character.getNumericValue(str.charAt(i));
				
				for(int j=1; j<x; j++) {
					
					System.out.println(str.charAt(i-1));
				}
			}
		}
	}
}
