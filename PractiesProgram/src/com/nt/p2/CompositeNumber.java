package com.nt.p2;

public class CompositeNumber {

	public static void main(String[] args) {
		
		int number = 45;
		
		int count =0;
		
		for(int i=1; i<=number; i++) {
			
			if(number % i==0) {
				count++;
			}
		}
		
		if(count>2) {
			System.out.println("composite number");
		}else {
			System.out.println("Not composite number");
		}
	}
}
