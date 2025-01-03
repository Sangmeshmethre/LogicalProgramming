package com.nt.BePracticalTechPrograms;

import java.util.HashMap;
import java.util.Map;

//Given an array of n element that contain element from 0-n-1
//with any of these numbers appearing any number of times. find This repeating Numbers.
//Input : n=7 and array[] = {1, 2, 3, 6, 3, 6,1};


public class DuplicateElement {

	public static void getDuplicate(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<arr.length; i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], map.getOrDefault(arr[i], 1));
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,6,3,6,1};
		getDuplicate(arr);
	}
}
