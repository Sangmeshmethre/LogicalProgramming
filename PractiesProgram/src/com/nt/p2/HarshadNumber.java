package com.nt.p2;

public class HarshadNumber {

	public static void main(String[] args) {
		
		int number = 156;
		
		int temp =number;
		
		int sum = 0;
		
		while(number > 0) {
			int d = number % 10;
			
			sum = sum+d;
			
			number = number/10;
		}
		
		System.out.println(sum);
		
		if(temp%sum==0) {
			System.out.println("Harshad number");
		}else {
			System.out.println("Not Harshad Number");
		}
	}
}
