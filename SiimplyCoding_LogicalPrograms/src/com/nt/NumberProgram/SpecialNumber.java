package com.nt.NumberProgram;

//Check if a number is special number or not. sum of digit plus product of digit its equals to 
// original number eg: 59. 5+9 = 5*9 == original number

public class SpecialNumber {

	public static void main(String[] args) {
		
		int number = 59;
		
		int temp = number;
		
		int sum = 0;
		int prod = 1;
		
		while(temp > 0) {
			
			int d = temp % 10;
			
			sum = sum + d;
			prod = prod*d;
			
			temp = temp /10;
			
		}
		
		System.out.println("sum::"+sum+" , prod::"+prod);
		
		if(sum+prod==number) {
			System.out.println("special number");
		}else {
			System.out.println("Not special number");
		}
	}
}
