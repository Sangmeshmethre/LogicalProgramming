package com.nt.p2;

public class NeonNumber {

	public static void main(String[] args) {
		
		int number = 9;
		
		int temp = number;
		number = number * number;
		int sum = 0;
		while(number > 0) {
			int d = number % 10;
			sum = sum+d;
			number = number/10;
		}
		System.out.println(sum);
		
		if(temp==sum) {
			System.out.println("Neon number");
		}else {
			System.out.println("not Neon number");
		}
	}
}
