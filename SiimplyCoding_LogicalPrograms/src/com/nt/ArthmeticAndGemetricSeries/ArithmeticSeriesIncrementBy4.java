package com.nt.ArthmeticAndGemetricSeries;

import java.util.Scanner;

public class ArithmeticSeriesIncrementBy4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//System.out.print("Enter Min number::");
		//int min = sc.nextInt();
		System.out.print("Enter max number::");
		int max = sc.nextInt();
		
		int sum = 0;
		for(int i=1,a=9; i<=max; i++, a+=4) {
			
			sum = sum+a;
			System.out.println();
		}
		System.out.print("Sum::"+sum);
		
	}
}
