package com.nt.BePracticalTechPrograms;


//Given an array arr[] of size n containing 0 and 1 only.
// the problem is to count the subArray having an equals number of 0 and 1
//int[] arr = {1,0, 0, 1, 0, 1, 1};


public class SubArrayWithEqualElement {

	public static void main(String[] args) {
		
		int[] arr = {1, 0, 0, 1, 0, 1, 1};
		
		int result = getSubArrayWithEqualElement(arr);
		System.out.println("Total subArray having equal number of 0's and 1::"+result);
	}
	
	public static int getSubArrayWithEqualElement(int[] arr) {
		
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==0) {
				arr[i] = -1;
			}
		}
		for(int i=0; i<arr.length; i++) {
			
			int sum = 0;
			for(int j=i; j<arr.length;j++) {
				
				sum = sum+arr[j];
				
				if(sum == 0) {
					
					System.out.println("( "+i+" "+j+" )");
					count++;
				}
			}
		}
		return count;
	}
}
