package com.nt.p2;

public class PrintReversedNumber {

	public static void main(String[] args) {
		
		int number = 8483;
		
		while(number != 0) {
			
			int d = number % 10;
			System.out.println(d);
			number = number/10;
		}
	}
}
