package com.nt.BePracticalTechPrograms;


//Given an array A[] of n numbers and another number x, the task is to check
//Whether or not there exist two elements in A[]; whose sum is exactly x.
//input::
/*int[] arr = {0, -1, 2, -3,1};
int x = -4;*/

public class SubArrayTwoSum {

	public static void main(String[] args) {
		
		int[] arr = {0, -1, 2, -3, 1};
		int x = -4;
		
		findSubArrayOfTwoSum(arr, x);
	}
	
	public static void findSubArrayOfTwoSum(int[] arr, int sum) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]+arr[j]==sum) {
					System.out.println("Sum of SubArray of Two Sum::"+sum);
				}
			}
		}
	}
}
