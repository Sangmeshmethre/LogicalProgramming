package com.nt.p2;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		int[] arr = {4,5,2,3,5,7,46,7};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
