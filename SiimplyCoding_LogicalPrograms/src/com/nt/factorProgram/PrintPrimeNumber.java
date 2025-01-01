package com.nt.factorProgram;


//Find if a number is a prime number.
//==>Prime number is a number divisible by 1 and itself 
// eg:: 1, 5

public class PrintPrimeNumber {

	public static void main(String[] args) {
		
		int number = 44;
		
		int count = 0;
		
		for(int i=1;i<=number; i++) {
			
			if(number % i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Not prime number");
		}
	}
}
