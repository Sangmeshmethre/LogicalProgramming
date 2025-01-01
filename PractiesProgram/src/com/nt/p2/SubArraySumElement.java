package com.nt.p2;

public class SubArraySumElement {

	public static void main(String[] args) {
		
		int[] arr = {-1, -2, 2,0, -4};
		int k = -4;
		
		sumArraySumElement(arr, k);
	}
	
	public static void sumArraySumElement(int[] arr, int k) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]+arr[j]==k) {
					System.out.println(arr[i]+arr[j]);
				}
			}
		}
	}
}
