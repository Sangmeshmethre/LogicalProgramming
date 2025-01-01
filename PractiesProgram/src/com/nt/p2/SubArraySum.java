package com.nt.p2;

public class SubArraySum {

	public static void main(String[] args) {
		
		
		int[] arr = {2,4,6, 10, 2, 1};
		int k = 12;
		
		int result = subArraySum(arr, k);
		System.out.println("SubArray of Two Sum::"+result);
	}
	
	public static int subArraySum(int[] arr, int k) {
		
		for(int i=0; i<arr.length; i++) {
			
			int sum = 0;
			
			for(int j=i+1; j<arr.length; j++) {
				
				sum = sum+arr[j];
				
				if(sum == k) {
					return i;
				}
			}
			
			if(arr[i]==k) {
				return 1;
			}
		}
		return -1;
	}
}
