package com.nt.p2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number = 5;
		int count=0;
		for(int i=1; i<=number; i++) {
			
			if(number % i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("number is prime");
		}else {
			System.out.println("Not prime number");
		}
	}
}
