package com.nt.BePracticalTechPrograms;

//Given an array of non negative Integer and a number.
//You need to Print all the starting and ending indices of SubArray having there sum
// equals to the given integer
//Input::
/*int[] arr = {2,3,6,4,9, 0, 11};
int num = 11;*/
public class StartingAndEndingIndicesOfSubArray {

	public static void main(String[] args) {
		
		int[] arr = {2,3,6,4,9, 0, 11};
		int num = 11;
		
		subArraySum(arr, num);
	}
	
	public static void subArraySum(int[] arr, int sum) {
		
		
		for(int i=0; i<arr.length; i++) {
			
			int elementSum = 0;
			
			for(int j=i; j<arr.length; j++) {
				
				elementSum = elementSum+arr[j];
				
				if(elementSum == sum) {
					System.out.println("Starting Index::"+i+" "+"Ending Index::"+j);
				}
			}
		}
	}
}
