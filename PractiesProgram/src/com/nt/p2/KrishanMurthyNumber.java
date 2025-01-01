package com.nt.p2;

public class KrishanMurthyNumber {

	public static void main(String[] args) {
		
		int number = 145;
		
		int temp = number;
		int sum = 0;
		while(number > 0) {
			
			int d = number % 10;
			
			int fact = 1;
			
			for(int i=1; i<=d; i++) {
				fact = fact*i;
			}
			sum = sum+fact;
			number= number/10;
		}
		System.out.println(sum);
		
		if(temp==sum) {
			System.out.println("krishna Murthy Number");
		}else {
			System.out.println("Not Krishna murthy Number");
		}
	}
}
