package com.nt.ApexonLogical;

/*
Find the median of two sorted arrays of different sizes.

Example:
arr1[] = {2, 3, 5, 8}
arr2[] = {10, 12, 14, 16, 18, 20}

//Return 11 as the median
*/
import java.util.ArrayList;
import java.util.Collections;

public class MediumArray {

	public static void main(String[] args) {
		
		int[] arr1 = {2,3,5,8};
		int[] arr2 = {10, 12, 14, 16, 18, 20};
		
		double medium = findMediumUsingCollection(arr1, arr2);
		System.out.println("Medium::"+medium);
		
	}
	
	public static double findMediumUsingCollection(int[] arr1, int[] arr2) {
		
		ArrayList<Integer> list = new ArrayList();
		
		for(int ar1:arr1) {
			list.add(ar1);
		}
		for(int ar2:arr2) {
			list.add(ar2);
		}
		
		Collections.sort(list);
		
		int size = list.size();
		
		if(size % 2 ==0) {
			return(list.get(size/2-1)+list.get(size/2))/2.0;
		}else {
			return list.get(size/2);
		}
	}
}
