package com.nt.BePracticalTechPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//In the given problem statement, we have an array of Integer and we need to find
/*maximum product possible for an continues subarray
int[] arr = {6, -3, -10, 0, 2};
*/
public class MaximumProductInSubArray {

	public static void main(String[] args) {
		
		int[] arr = {6, -3, -10, 0, 2};
		
		int result = getMaxProduct(arr);
		System.out.println("Max product::"+result);
		
	}
	
	public static int getMaxProduct(int[] arr) {
		
		List<Integer> list = new ArrayList();
		
		for(int i=0; i<arr.length; i++) {
			
			int product = 1;
			
			for(int j=i; j<arr.length; j++) {
				
				product = product*arr[j];
				list.add(product);
			}
		}
		return Collections.max(list);
	}
}
