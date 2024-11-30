package com.nt.BePracticalTechPrograms;


// you are given an integer array containing 1 to n but one of the number from 1 to n in the array is missing. you need 
//to provide optimum solution to find the missing number. Number can not be repeated in the array
/*
for eg::
	int[] arr = {7, 5, 6, 1,4,2};
    Missing Number = 3;
    int[] arr2 = {5,3,1,2};
    Missing Number = 4;
    
    */
public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {7, 5, 6, 1,4,2};
	    
		
		int sum1 =0, sum2 = 0;
		
		for(int i=0;i<arr.length; i++) {
			sum1 = sum1 +arr[i];
			
		}
		for(int i=1; i<=7; i++) {
			sum2 = sum2+i;
		}
		System.out.println("Missing Number::"+(sum2-sum1));
		
		//int n = arr.length;
		
		//findMissngNumber(arr, n);
	}
	
	//Approach-2
	/*
	 * public static void findMissngNumber(int[] arr, int n) {
	 * 
	 * int elementSum = 0;
	 * 
	 * int length = n+1;
	 * 
	 * int sumTotal = length*(length+1)/2;
	 * 
	 * for(int ele:arr) {
	 * 
	 * elementSum = elementSum+ele; } int missingNumber = sumTotal-elementSum;
	 * System.out.println(missingNumber); }
	 */
}
