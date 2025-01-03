package com.nt.BePracticalTechPrograms;

//Given an array arr[].print all even Numbers on left and odd numbers to right side
// input::
//arr[] = {12, 17, 70, 15, 22, 65, 21, 90};


public class EvenAndOddNumberInArray {

	public static int[] separateEvenOdd(int[] arr) {
		
		int[] temp = new int[arr.length];
		
		int count = getCount(arr);
		int evenCount=0;
		int oddCount = count;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] % 2==0) {
				temp[evenCount++] = arr[i];
			}
			if(arr[i] % 2==1) {
				temp[oddCount++] = arr[i];
			}
		}
		return temp;
	}
	private static int getCount(int[] arr) {
		
		int count = 0;
		
		for(int ele:arr) {
			if(ele % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
		
		int[] result = separateEvenOdd(arr);
		
		for(int data:result) {
			System.out.print(data+" ");
		}
	}
}
