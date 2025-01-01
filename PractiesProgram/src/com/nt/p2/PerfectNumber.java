package com.nt.p2;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int number = 6;
		
		int sum = 0;
		
		for(int i=1; i<number; i++) {
			
			if(number % i==0) {
				sum =sum+i;
			}
		}
		System.out.println(sum);
		
		if(sum==number) {
			System.out.println("perfect number");
		}else {
			System.out.println("Not perfect number");
		}
	}
}
