package com.nt.p2;

import java.util.ArrayList;

public class SearchPrefixe {

	public static void main(String[] args) {
		
		String[] dict = {"apple", "applet", "bread", "apear"};
		String prefixe = "app";
		
		searchPrefixe(dict, prefixe);
	}
	
	public static void searchPrefixe(String[] dict, String prefixe) {
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<dict.length; i++) {
			
			if(dict[i].startsWith(prefixe)) {
				list.add(dict[i]);
			}
		}
		System.out.println(list);
	}
}
