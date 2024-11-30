package com.nt.ApexonLogical;


/*Given a sorted rotated array,
return the minimum element from it.

Examples:
int[] arr1 = {5, 6, 1, 2, 3, 4};    //Return 1

int[] arr2 = {1, 2, 3, 4};            //Return 1
*/public class MinimumElementInSortedArray {

	public static void main(String[] args) {
		
		int[] arr = {5,6,1,2,3,4};
		
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum Element is::"+min);
	}
}
