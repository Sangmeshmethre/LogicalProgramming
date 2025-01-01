package com.nt.p1;

import java.util.ArrayList;

public class SearchPrefixe {

	public static void main(String[] args) {
		
		String[] dict = {"apple", "applet", "bread", "apear"};
		String prefixe = "app";
		
		searchPrefixe(dict, prefixe);
	}
	
	public static void searchPrefixe(String[] dict, String prefixe) {
		
		ArrayList<String> list = new ArrayList<>();
		
		for(String word:dict) {
			
			if(word.startsWith(prefixe)) {
				list.add(word);
			}
		}
		System.out.println("Prefixe word is::"+list);
	}
}
