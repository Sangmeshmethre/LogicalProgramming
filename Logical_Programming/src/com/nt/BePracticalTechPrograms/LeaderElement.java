package com.nt.BePracticalTechPrograms;


//Find the leader Element in an array, 
// we need to print all the leaders present in an array
//Note::Element is the leader if it is greater then right side of elements.
// the right most element is always a leader in an array;
//input::
//	arr[] = {14, 12, 70, 15, 99, 65, 21, 90};


public class LeaderElement {

	public static void main(String[] args) {
		
		int[] arr = {14, 12, 70, 15, 99, 65, 21, 90};
		
		findLeaderElement(arr);
	}
	
	public static void findLeaderElement(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			int j;
			for(j=i+1; j<arr.length; j++) {
				
				if(arr[i]<= arr[j]) {
					break;
				}
			}
			if(j==arr.length) {
				System.out.println("Every Array Last Element::"+arr[i]);
			}
		}
	}
}
