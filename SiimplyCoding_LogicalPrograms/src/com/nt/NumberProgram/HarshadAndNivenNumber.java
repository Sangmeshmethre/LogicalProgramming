package com.nt.NumberProgram;


//Check if a number is Niven/Harshad number or not. A number Which is Divisible by the sum of its digit
// eg:: 156 = 1+5+6 = 12;

public class HarshadAndNivenNumber {

	public static void main(String[] args) {
		
		int number = 156;
		
		int temp = number;
		
		int sum = 0;
		
		while(temp > 0) {
			
			int d = temp % 10;
			
			sum = sum+d;
			
			temp = temp / 10;
		}
		
		System.out.println("Harshad Number::"+sum);
		
		if(number%sum==0) {
			System.out.println("Number is Navin/Harshad ");
		}else {
			System.out.println("Number is not Harshad");
		}
	}
}
