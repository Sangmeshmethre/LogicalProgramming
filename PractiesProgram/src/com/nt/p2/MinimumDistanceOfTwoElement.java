package com.nt.p2;

public class MinimumDistanceOfTwoElement {

	public static void main(String[] args) {
		
		int[] arr = {3,4,5,6,7,8,8,9,33};
		int arr1 = 5;
		int arr2 = 33;
		
		miniumDistanceOfTwoElement(arr, arr1, arr2);
	}
	
	public static void miniumDistanceOfTwoElement(int[] arr, int arr1, int arr2) {
		
		int min_dist = Integer.MAX_VALUE;
		
		int lastIndex1 = -1;
		int lastIndex2 = -1;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == arr1) {
				lastIndex1 = i;
				
				
			}
			
			if(arr[i] == arr2) {
				lastIndex2 = i;
			}
			
if(lastIndex1 >= 0 && lastIndex2 >= 0) {
				
				min_dist = Math.min(min_dist, Math.abs(lastIndex1-lastIndex2));
			}
		}
		
		System.out.println("Minium Distatnce of tow Element::"+min_dist);
	}
}
