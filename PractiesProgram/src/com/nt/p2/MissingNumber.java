package com.nt.p2;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		
		int sum1 =0, sum2 =0;
		
		for(int i=0; i<arr.length; i++) {
			
			sum1 = sum1+arr[i];
		}
		
		for(int i=1; i<=6; i++) {
			
			sum2 = sum2+i;
		}
		
		System.out.println("sum of missing number::"+(sum2-sum1));
		
	}
}
