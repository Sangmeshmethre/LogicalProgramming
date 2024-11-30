package com.nt.ApexonLogical;

/*Prefix Search
Given a document and a prefix, return all the words starting with the prefix.

Example:
Say the document is a string of words,
String[] arr = {"apple", "applet", "bread", "aper"};
String prefix = "app";

// Return apple, applet
*/
import java.util.ArrayList;
import java.util.List;

public class PreFixeSearch {

	public static void main(String[] args) {
		
		String[] arr = {"apple", "applet", "apear","bread"};
		String prefixe = "app";
		
		findPrefixeSearch(arr, prefixe);
	}
	
	public static void findPrefixeSearch(String[] arr, String toString) {
		
		List<String> list = new ArrayList();
		
		for(String word:arr) {
			
			if(word.startsWith(toString)) {
				list.add(word);
			}
		}
		System.out.println(list);
	}
}
