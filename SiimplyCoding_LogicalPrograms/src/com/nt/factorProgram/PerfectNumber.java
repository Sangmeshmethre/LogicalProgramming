package com.nt.factorProgram;


//Find if a no.is perfect number.
//===>A perfect Number is equal to sum of its divisors or factor except itself
//eg::6=1+2+3

public class PerfectNumber {

	public static void main(String[] args) {
		
		int number = 6;
		
		int sum = 0;
		
		for(int i=1; i<number; i++) {
			if(number % i==0) {
				sum = sum+i;
			}
		}
		
		if(sum==number) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not Perfect Number");
		}
	}
}
