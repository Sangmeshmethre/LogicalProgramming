package com.nt.ApexonLogical;


/*Given a sorted array of non-negative integers of size n,
return the smallest missing integer.

Examples:
int[] arr1 = {1, 2, 3, 4};    // Return 0

int[] arr2 = {0, 1, 3, 4};    // Return 2

*/public class SmallestMissingInteger {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		int sum1 = 0; 
		int sum2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			sum1 = sum1 +arr[i];
			
		}
		for(int i=1; i<=4; i++) {
			
			sum2 =sum2+i;
		}
		
		System.out.println("Smallest Missing Integer::"+(sum2-sum1));
	}
}
