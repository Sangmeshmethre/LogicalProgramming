package com.nt.p2;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int number = 153;
		
		int temp =number;
		
		int count =0;
		int AmstrongNumber = 0;
		
		while(number > 0) {
			number = number/10;
			count++;
		}
		System.out.println("count Digits::"+count);
		
		while(temp > 0) {
			
			int d = temp%10;
			
			AmstrongNumber = AmstrongNumber+(int)Math.pow(d, count);
			
			temp = temp /10;
		}
		System.out.println("AmstrongNumber::"+AmstrongNumber);
		
		boolean result = true;
		
		if(result == true) {
			System.out.println("Amstrong number");
		}else {
			System.out.println("Not Amstrong number");
		}
		
	}
}
