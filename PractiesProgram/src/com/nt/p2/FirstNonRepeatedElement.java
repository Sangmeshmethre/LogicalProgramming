package com.nt.p2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedElement {

	public static void main(String[] args) {
		
		int[] arr = {3,4,5,6,7,3,2,4,5};
		
		firstNonRepeatedElement(arr);
	}
	
	public static void firstNonRepeatedElement(int[] arr) {
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], map.getOrDefault(arr[i], 1));
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entryset:map.entrySet()) {
			
			if(entryset.getValue()==1) {
				System.out.println(entryset);
				break;
			}
		}
	}
}
