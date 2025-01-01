package com.nt.p2;

public class AutomorphicNumber {

	public static void main(String[] args) {
		
		int number = 625;
		
		int temp = number;
		int q = number * number;
		int falg = 0;
		while(number > 0) {
			
			int d = number % 10;
			int d1 = q % 10;
			
			if(d != d1) {
				falg = 1;
			}
			number = number /10;
			q = q/10;
		}
		
		if(falg==0) {
			System.out.println("Automorphic Number");
		}else {
			System.out.println("Not Automorphic Number");
		}
	}
}
