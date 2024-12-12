package com.nt.NumberProgram;


//Check if a number is spy number or not. Means sum its digits equals the product of the digits 
//eg::123. 1+2+3=1*2*3 (sum == product);


public class SpyNumber {

	public static void main(String[] args) {
		
		int number = 123;
		
		int temp = number;
		
		int sum = 0, prod = 1;
		
		while(temp > 0) {
			
			int d = temp % 10;
			
			sum = sum+d;
			prod = prod*d;
			
			temp = temp/10;
		}
		System.out.println("sum::"+sum+" , Product::"+prod);
		if(sum == prod) {
			System.out.println("spy number");
		}else {
			System.out.println("Not spy number");
		}
	}
}
