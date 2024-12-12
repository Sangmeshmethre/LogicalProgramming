package com.nt.ArthmeticAndGemetricSeries;

import java.util.Scanner;

public class ArithmeticSeriesIncrementBy1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter minimum Number::");
		int min = sc.nextInt();
		System.out.print("Enter Maximum Number::");
		int max = sc.nextInt();
		
		int sum = 0;
		for(int i=min; i<=max; i++) {
			
			System.out.print(i+" ");
		}
		
		for(int i=1, a=min; i<=max; i++,a++) {
			
			sum = sum+a;
			System.out.print(i+"+");
		}
		
		System.out.println("sum::"+sum);
	}
}
