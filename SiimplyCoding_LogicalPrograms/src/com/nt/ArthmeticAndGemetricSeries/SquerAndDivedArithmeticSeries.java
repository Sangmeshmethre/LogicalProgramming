package com.nt.ArthmeticAndGemetricSeries;


//x^1+x^2+x^3........N;
//9^2+13^2...........N;

import java.util.Scanner;

public class SquerAndDivedArithmeticSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Nth Number::");
		int n = sc.nextInt();
		//System.out.print("Enter xth Number::");
		//int x = sc.nextInt();
		
		double sum = 0;
		
		for(int i=1,a=9; i<=n; i++,a+=4) {
			
			sum = sum+Math.pow(a,2);
		}
		
		System.out.println("Sum of Arithmetic Squere::"+sum);
	}
}
