package com.nt.BePracticalTechPrograms;

//Write a java program to find the index position of a key element in the given array
//arr = {1,2,3,4,5,6,7};
// key = 5;
public class SearchElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		int key = 5;
		
		int result = searchElement(arr, key);
		System.out.println(result);
	}
	
	public static int searchElement(int[] arr, int key) {
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
}
