package com.nt.p2;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		
		String str = "sangmeshmethre";
		
		char[] ch = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			
			for(int j=i+1;j<ch.length; j++) {
				
				if(ch[i] > ch[j]) {
					
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ch));
		System.out.println(new String(ch));
	}
}
