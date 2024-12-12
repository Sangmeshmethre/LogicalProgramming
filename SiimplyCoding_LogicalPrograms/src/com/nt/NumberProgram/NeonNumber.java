package com.nt.NumberProgram;


//Check if a number is Neon number or not,
// sum of digit of square of the number is equals to number 
// eg:: 9, 9*9 = 81 , 8+1= 9;

public class NeonNumber {

	public static void main(String[] args) {
		
		int number = 9;
		
		int temp = number;
		int sum = 0;
		number = number*number;
		
		while(number > 0) {
			
			int d = number % 10;
			
			sum = sum+d;
			
			number = number / 10;
		}
		System.out.println("sum of Square number::"+sum);
		
		if(sum == temp) {
			System.out.println("Neon Number");
		}else {
			System.out.println("Not Neon Number");
		}
	}
}
