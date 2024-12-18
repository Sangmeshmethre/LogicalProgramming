package com.nt.BePracticalTechPrograms;

//Java Program to find the minimum Distance between Array Element
//input::
/*int[] arr = {21, 25, 29, 11, 15, 10};
int fistElement = 25;
int SecondElement = 15;*/

public class MinimumDistanceOfTwoArray {

	public static void main(String[] args) {
		
		int[] arr = {21, 25, 29, 11, 15, 10};
		int fistElement = 25;
		int secondElement = 15;
		
		findMinDistance(arr, fistElement,secondElement);
		minDist(arr, fistElement, secondElement);
	}
	
	public static void findMinDistance(int[] arr, int fistElement, int secondElement) {
		
		int minLength = Integer.MAX_VALUE;
		int lastIndex1 = -1;
		int lastIndex2 = -1;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == fistElement) {
				lastIndex1 = i;
			}
			if(arr[i] == secondElement) {
				lastIndex2 = i;
			}
			
			if(lastIndex1 >= 0 && lastIndex2 >= 0) {
			minLength = Math.min(minLength, Math.abs(lastIndex1-lastIndex2));
			}
		}
		System.out.println("Minimum Distance Between Two Integer array::"+minLength);
	}
	
	//Approach-2
	
	public static void minDist(int[] arr, int x, int y) {
		
		int minDist = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==x && arr[j]==y) {
					minDist = Math.min(minDist, Math.abs(i-j));
				}
				if(arr[i]==y && arr[j]==x) {
					minDist = Math.min(minDist, Math.abs(i-j));
				}
			}
		}
		System.out.println("Minimum Distance Between Two Integer array::"+minDist);
	}
}
