package com.nt.p2;

class Data{
	
	int smallestElement;
	int secondLargestElement;
}
public class SecondLargestElementAndSmallestElement {

	public static void main(String[] args) {
		
		int[] arr = {4,5,6,3,4,5,99,84,73,93};
		
		Data dt = secondLargestElementAndSmallestElement(arr);
		
		System.out.println(dt.secondLargestElement);
		System.out.println(dt.smallestElement);
	}
	
	public static Data secondLargestElementAndSmallestElement(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		Data dt = new Data();
		
		dt.secondLargestElement = arr[arr.length-2];
		dt.smallestElement = arr[0];
		
		return dt;
	}
}
