package com.nt.ApexonLogical;

public class TrapWater {

	public static void main(String[] args) {
		
		int[] arr = {3,0,2,0,4};
		
		System.out.println("Traping Water ::"+trapingWater(arr));
	}
	
	public static int trapingWater(int[] arr) {
		
		int n = arr.length;
		
		int water = 0;
		
		if(n==0) {
			return 0;
		}
		
		int[] left = new int[n];
		
		left[0] = arr[0];
		for(int i=1; i<arr.length; i++) {
			left[i] = Math.max(left[i-1], arr[i]);
		}
		
		int[] right = new int[n];
		
		right[n-1] = arr[n-1];
		for(int i=n-2; i>=0; i--) {
			right[i] = Math.max(right[i+1], arr[i+1]);
		}
		
		for(int i=0; i<arr.length; i++) {
			
			water = water+Math.min(left[i], right[i])-arr[i];
		}
		
		return water;
	}
}
