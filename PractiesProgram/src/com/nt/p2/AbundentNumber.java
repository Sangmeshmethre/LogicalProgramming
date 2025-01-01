package com.nt.p2;

public class AbundentNumber {

	public static void main(String[] args) {
		
		int number = 12;
		
		int sum = 0;
		
		for(int i=1; i<number; i++) {
			
			if(number % i==0) {
				
				sum = sum+i;
				
			}
		}
		System.out.println(sum);
		if(sum>number) {
			System.out.println("Abundent number");
		}else {
			System.out.println("not Abundent number");
		}
	}
}
