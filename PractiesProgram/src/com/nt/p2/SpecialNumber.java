package com.nt.p2;

public class SpecialNumber {

	public static void main(String[] args) {
		
		int number = 59;
		
		int temp = number;
		
		int sum = 0;
		int product = 1;
		
		while(number != 0) {
			
			int d = number % 10;
			sum = sum+d;
			product = product*d;
			number = number/10;
		}
		
		System.out.println(sum);
		System.out.println(product);
		
		if(sum+product==temp) {
			System.out.println("special number");
		}else {
			System.out.println("Not special number");
		}
	}
}
