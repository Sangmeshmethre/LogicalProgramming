package com.nt.p2;

public class DuckNumber {

	public static void main(String[] args) {
		
		int number = 430;
		
		int temp = number;
		
		int count =0;
		
		while(number != 0) {
			
			int d = number % 10;
			
			if(d==0) {
				count++;
			}
			number = number/10;
		}
		
		if(count>0) {
			System.out.println("Duck number");
		}else {
			System.out.println("Not Duck Number");
		}
	}
}
