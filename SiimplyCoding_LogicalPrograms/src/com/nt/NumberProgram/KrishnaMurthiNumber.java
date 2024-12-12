package com.nt.NumberProgram;


//check if number is KM,special number or not. where sum of factorial of digits is equals to the number
// 145 = 1!+4!+5!


public class KrishnaMurthiNumber {

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
			
			number = number/10;
		}
		
		System.out.println(sum);
		
		if(sum==temp) {
			System.out.println("Krishna Murthiy Number");
		}else {
			System.out.println("Not Krishna Murthiy Number");
		}
	}
}
