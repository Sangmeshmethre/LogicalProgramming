package com.nt.BePracticalTechPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

//Given an array of integer of size N, the task is to find 
// the first non repeating element in this array
//input::
//	arr[] = {-1, 2, -1, 3, 0};


public class FirstNonRepitingElement {

	public static void main(String[] args) {
		
		int[] arr = {-1, 2, -1, 3, 0};
		
		getNonRepeatingElement(arr);
		
	}
	
	public static void getNonRepeatingElement(int[] arr) {
		
		Map<Integer, Integer> map = new LinkedHashMap();
		
		for(int i=0;i<arr.length; i++) {
			
			if(!map.containsKey(arr[i])) {
				
				map.put(arr[i], map.getOrDefault(arr[i], 1));
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entryset:map.entrySet()) {
			
			if(entryset.getValue()==1) {
				System.out.println(entryset.getKey());
				break;
			}
		}
	}
}
