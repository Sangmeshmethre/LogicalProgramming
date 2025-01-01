package com.nt.NumberProgram;

public class CopositeNumber {

	public static void main(String[] args) {
		
		int number = 10;
		int count = 0;
		for(int i=1; i<=number; i++) {
			
			if(number % i==0) {
				
				count++;
			}
		}
		
		if(number >2) {
			System.out.println("composit number");
		}else {
			System.out.println("not composti number");
		}
	}
}
