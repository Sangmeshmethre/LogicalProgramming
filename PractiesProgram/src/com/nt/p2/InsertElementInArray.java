package com.nt.p2;

import java.util.Arrays;

public class InsertElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {4,5,6,8,4};
		int postion = 3;
		int element = 20;
		
		for(int i=arr.length-1; i>postion-1; i--) {
			
			arr[i] = arr[i-1];
		}
		
		arr[postion-1] = element;
		
		System.out.println(Arrays.toString(arr));
	}
}
