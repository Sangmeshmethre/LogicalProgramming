package com.nt.p2;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		
		int[] arr = {3,4,5,6,7};
		int d = 5;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==d) {
				
				for(int j=0; j<i; j++) {
					
					arr[j] = arr[j+1];
				}
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
