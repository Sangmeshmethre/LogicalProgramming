package com.nt.factorProgram;


//Find if a no. is a Abundant no. Here sum of factor is greater than the no.itself eg:12.Factor 1,2,3,4,6=16>12
public class AbundantNumber {

	public static void main(String[] args) {
		
		int number = 12;
		
		int sum = 0;
		
		for(int i=1; i<number; i++) {
			
			if(number % i==0) {
				sum = sum+i;
			}
		}
		
		if(sum>number) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}
}
