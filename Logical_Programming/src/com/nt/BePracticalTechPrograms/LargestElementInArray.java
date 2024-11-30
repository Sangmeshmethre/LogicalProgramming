package com.nt.BePracticalTechPrograms;


//Write a java program to find the largest element in an array 
// int[] arr = {22, 21, 24, 23, 54, 8};


public class LargestElementInArray {

	public static void largestElement(int[] arr) {
		int max = arr[0];
		for(int ele:arr) {
			if(ele > max) {
				max = ele;
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		
		int[] arr = {22, 21, 24, 23, 54, 8};
		
		largestElement(arr);
		
		int result = largestElmenet(arr);
		System.out.println("Largest Element::"+result);
	}
	
	public static int largestElmenet(int[] arr) {
		
		int largestElement = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > largestElement)
				largestElement = arr[i];
		}
		
		return largestElement;
	}
}
