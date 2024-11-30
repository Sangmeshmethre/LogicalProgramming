package com.nt.BePracticalTechPrograms;

import java.util.Arrays;

//Write a java program to find the second Largest & Smallest Element in an array
// arr[] = {22, 21, 24, 23, 54, 8};

class Data{
	
	int secondLargest;
	int smallestElement;
}
public class SecondLargestAndSmalletElement {

	public static Data getValue(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		Data obj = new Data();
		
		obj.secondLargest = arr[arr.length-2];
		obj.smallestElement = arr[0];
		
		return obj;
	}
	
	//Approach -2
public static void findSmallest2LargestElement(int[] arr) {
		
		int min = arr[0];
		int secondLargesElement = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
			secondLargesElement = arr[arr.length-4];
			
			for(int i=0; i<arr.length; i++) {
				
				if(arr[i] < min) {
					min = arr[i];
				}
			}
		
		System.out.println("smallest Element::"+min);
		System.out.println("SecondLargest element::"+secondLargesElement);
	}
	public static void main(String[] args) {
		
		int[] arr = {22,21,24,23,54,8};
		
		findSmallest2LargestElement(arr);
		Data result = getValue(arr);
		System.out.println(" Second Largest Element::"+result.secondLargest+" ,Smallest Element:"+result.smallestElement);
		
	}
}
