package com.nt.ApexonLogical;

/*
Given an array of integers and a sum K,
return the length of the shortest sub-array which matches the given sum. If it doesn't exist, return -1.
[Even a single integer can be considered as a sum.]

Examples:
int[] arr = {2, 4, 6, 10, 2, 1}, K = 12        // Return 2

int[] arr = {5, 8, 50, 4}, K = 50                // Return 50 (A single integer may be considered as a sum)
*/
public class SubArrayOfTwoSum {

	public static void main(String[] args) {
		
		int[] arr = {2,4,6,10, 2, 1};
		int k = 12;
		
		int result = findSubArrayOfSum(arr, k);
		System.out.println("SubArraySum is::"+result);
		
	}
	
	public static int findSubArrayOfSum(int[] arr, int k) {
		int minLength = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			int sum = 0;
			
			for(int j=i; j<arr.length; j++) {
				
				sum= sum+arr[j];
				
				if(sum ==k) {
					minLength = Math.min(minLength, j-i+1);
				}
			}
			if(arr[i]==k) {
				return 1;
			}
			
		}
		return minLength==Integer.MAX_VALUE?-1:minLength;
	}
}
