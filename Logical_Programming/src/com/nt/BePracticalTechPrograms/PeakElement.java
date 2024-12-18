package com.nt.BePracticalTechPrograms;

//Given An Array arr[] of Integer FindPeak Element i.e. an element that is not smaller Than its neighbors.
// int[] arr = {5, 10, 20, 15};

public class PeakElement {

	public static void main(String[] args) {
		
		int[] arr = {5, 10, 20, 15};
		
		int n = arr.length;
		
		int result  = findPeakElement(arr, n);
		System.out.println("PeakElement is::"+result);
	}
	
	public static int findPeakElement(int[] arr, int n) {
		
		if(n==1) return 0;
		if(isIncrement(arr)) return n-1;
		if(isDecrement(arr)) return 0;
		
		for(int i=1; i<arr.length-1; i++) {
			
			if(arr[i]>=arr[i-1] && arr[i]>= arr[i+1]) {
				return i;
			}
		}
		return -1;
	}

	private static boolean isDecrement(int[] arr) {
		
		boolean  result = true;
		for(int i=0;i<arr.length-1; i++) {
			if(arr[i] < arr[i+1])
				result = false;
		}
		return result;
	}

	private static boolean isIncrement(int[] arr) {
		
		boolean result = true;
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i] > arr[i+1])
				result = false;
		}
		return result;
	}
}
