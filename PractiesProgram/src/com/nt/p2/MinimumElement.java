package com.nt.p2;

public class MinimumElement {

	public static void main(String[] args) {
		
		int[] arr = {3,4,5,6,7};
		
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Minimum Distatance::"+min);
	}
}
