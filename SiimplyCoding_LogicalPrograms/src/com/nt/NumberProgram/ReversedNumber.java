package com.nt.NumberProgram;

import java.util.Scanner;

//Print all digits of number 268 on different lines

public class ReversedNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number::");
		int n = sc.nextInt();
		
		while(n>0) {
			int d = n % 10;
			System.out.print(d);
			n = n/10;
		}
		
	}
}
